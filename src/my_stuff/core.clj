(ns my-stuff.core
  (:gen-class))

(defn gen-r
  "Generates an instance of r, using i for the value of f(0)."
  [i]
  ;; Returns a function that generates f(n), having f(0) = i
  (fn r
    [n]
    (if (= n 0)
      ;; f(0), terminal case
      i
      ;; else, recursive case
      (let [n-prev (r (- n 1))]
        (if (even? n-prev)
          (/ n-prev 2)
          (+ (* n-prev 3) 1))))))

(defn -main
  []
  (let [range-end 10
        f-zero-val 5]
    (println (map
              (gen-r f-zero-val)
              (range 0 range-end)))))

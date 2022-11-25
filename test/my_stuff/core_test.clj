(ns my-stuff.core-test
  (:require [clojure.test :refer :all]
            [my-stuff.core :refer :all]))

(deftest gen-r-test
  (testing "Produces expected value."
    (let [range-end 10
        f-zero-val 5]
    (is (= 
         ;; Expected sequence
         '(5 16 8 4 2 1 4 2 1 4) 
         ;; Actual sequence
         (map
          ;; Generates an instance of r, having f(0)=f-zero-val as it's terminal case.
          (gen-r f-zero-val)
          (range 0 range-end))
         )))))

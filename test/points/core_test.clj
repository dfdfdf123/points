(ns points.core-test
  (:require [clojure.test :refer :all]
            [points.core :refer :all]))

(deftest a-test
  (testing "make-point"
    (is (= "(1, 2)" (to-string (make-point 1 2))))
    (is (= "(0, 0)" (to-string (make-point 0 0))))
    (is (= "(-1, -2)" (to-string (make-point -1 -2)))))
  (testing "get-x" 
    (is (= 1 (get-x (make-point 1 2))))
    (is (= -1 (get-x (make-point -1 2)))))
  (testing "get-y"
    (is (= 2 (get-y (make-point 1 2))))
    (is (= 3 (get-y (make-point -1 3)))))
  (testing "get-quadrant" 
    (is (= 0 (get-quadrant (make-point 0 2))))
    (is (= 0 (get-quadrant (make-point 1 0))))
    (is (= 1 (get-quadrant (make-point 1 2))))
    (is (= 2 (get-quadrant (make-point -1 2))))
    (is (= 3 (get-quadrant (make-point -1 -2))))
    (is (= 4 (get-quadrant (make-point 1 -2)))))
  (testing "get-sym-point" 
    (is (= (to-string (make-point -1 -2)) (to-string (get-sym-point (make-point 1 2)))))
    (is (= (to-string (make-point 1 -2)) (to-string (get-sym-point (make-point -1 2)))))
    (is (= (to-string (make-point -1 2)) (to-string (get-sym-point (make-point 1 -2)))))
    (is (= (to-string (make-point 1 2)) (to-string (get-sym-point (make-point -1 -2)))))))

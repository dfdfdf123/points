(ns points.core 
  (:require [points.util :refer :all]))

(defn make-point [x y] (list x y))

(defn get-x [point] (first point))

(defn get-y [point] (second point))

(defn to-string 
  [point] 
  (str "(" (get-x point) ", " (get-y point) ")"))

(defn get-quadrant
  [point] 
  (let [x (get-x point) 
        y (get-y point)]
    (cond 
      (or (= x 0) (= y 0)) 0
      (and (> x 0) (> y 0)) 1
      (and (< x 0) (> y 0)) 2 
      (and (< x 0) (< y 0)) 3 
      :else 4)))

(defn get-sym-point [point] 
  (make-point (- (get-x point)) (- (get-y point))))

(defn calc-distance [p1 p2]
  (let [x (square (- (get-x p2) (get-x p1))) 
        y (square (- (get-y p2) (get-y p1)))]
    (Math/sqrt (+ x y))))

(ns points.core)

(defn make-point [x y] (list x y))

(defn get-x [point] (first point))

(defn get-y [point] (second point))

(defn to-string 
  [point] 
  (str "(" (get-x point) ", " (get-y point) ")"))

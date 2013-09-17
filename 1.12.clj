;;; Exercise 1.12
;;;   Procedure to compute elements of Pascal's
;;;   Triangle by means of a recursive process.

(defn pascal-elem
  "Compute given element of Pascal's Triangle"
  [row, index]
  (cond
   (= row 1) 1
   (= index 0) 1
   (= index (dec row)) 1
   :else (+ (pascal-elem (dec row) (dec index))
            (pascal-elem (dec row) index))))

(defn pascal-row
  "Compute given row of Pascal's Triangle"
  [row]
  (let [f (partial pascal-elem row)]
    (map f (range row))))

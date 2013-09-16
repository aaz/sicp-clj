;;; Exercise 1.11
;;;   f(n) = n, if n < 3
;;;   f(n) = f(n-1) + 2f(n-2) + 3f(n-3), if n >= 3

;;; Recursive process for f

(defn f-recur
  "Computes f(n) using a recursive process"
  [n]
  (cond
   (< n 3) n
   :else (+ (f-recur (- n 1))
            (* 2 (f-recur (- n 2)))
            (* 3 (f-recur (- n 3))))))

;;; Iterative process for f

(defn f-iter
  "Computes f(n) using an iterative process"
  [n]
  (letfn [(f
            [fn-1 fn-2 fn-3 count n]
            (let [fn (+ fn-1 (* 2 fn-2) (* 3 fn-3))]
              (cond
               (= count n) fn
               :else (f fn fn-1 fn-2 (+ count 1) n))))]
    (cond
     (< n 3) n
     :else (f 2 1 0 3 n))))

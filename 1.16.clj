(declare expt expt-iter)

(defn expt
  "Compute b to the power of n using successive squaring"
  [b n]
  (cond
   (even? n) (expt-iter 1 (* b b) (/ n 2))
   :else (* b (expt-iter 1 (* b b) (/ (dec n) 2)))))

(defn expt-iter
  "Use an iterative process to compute b to the power of n"
  [a b n]
  (cond
   (= n 0) a
   :else (expt-iter (* a b) b (dec n))))

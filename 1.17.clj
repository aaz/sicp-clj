(defn fast-multiply
  "Procedure to multiply a by b. Steps grow logarithmically with b."
  [a b]
  (letfn [(double [n] (+ n n))
          (halve [n] (/ n 2))]
    (cond
     (= b 0) 0
     (even? b) (double (fast-multiply a (halve b)))
     :else (+ a (fast-multiply a (dec b))))))

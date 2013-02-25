; A simple and very inefficient way to compute pi
(def square #(* % %))
(def sqrt #(Math/sqrt %))
(def randsq #(map square (take % (repeatedly rand))))
(def radius #(map sqrt (map + (randsq %) (randsq %))))

(defn count-inside-circle [s] (count (filter #(< % 1.0) s)))
(def montecarlo-pi #(* 4.0 (/ (count-inside-circle (radius %)) %)))

(println (montecarlo-pi 50000))


(ns clojure.fatorial_recursiva)

(defn fatorial [number]
  (cond
    (<= number 1) number
    :else (* number (fatorial (- number 1)))))

(println (fatorial 5))

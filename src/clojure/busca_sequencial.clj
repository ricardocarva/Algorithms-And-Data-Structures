(ns clojure.busca_sequencial)

(defn busca [data value]
  (loop [index 0]
    (cond
      (>= index (count data)) -1
      (= value (nth data index)) index
      :else (recur (inc index)))))

(let [data [8 1 2 6 3 9 7 5 4]]
  (println "Data:" data)
  (println "Value 3 found at index" (busca data 3))
  (println "Value 4 found at index" (busca data 4))
  (println "Value 8 found at index" (busca data 8))
  (println "Value 0 found at index" (busca data 0)))

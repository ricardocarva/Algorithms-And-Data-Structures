(ns clojure.fibonacci)

(defn fibonacci [n]
  (cond
    (< n 2) n
    :else (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(println "Fibonacci 10:" (fibonacci 10))
(println "Fibonacci 20:" (fibonacci 20))
(println "Fibonacci 30:" (fibonacci 30))

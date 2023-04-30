(ns clojure.tower_of_hanoi
  (:require [clojure.string :as string]))

(defn hanoi
  ([disks] (hanoi [] 0 2 1 disks))
  ([acc pin0 pin2 pin1 disks]
  (cond
    (= disks 1) (conj acc {:from pin0 :to pin2})
    :else (into [] (concat
            (hanoi acc pin0 pin1 pin2 (- disks 1))
            (hanoi acc pin0 pin2 pin1 1)
            (hanoi acc pin1 pin2 pin0 (- disks 1)))))))

(->> (hanoi 3)
     (map #(str "Move from " (:from %) " to " (:to %)))
     (string/join "\n")
     println)

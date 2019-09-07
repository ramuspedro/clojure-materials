(ns reverse-string
  (:require [clojure.string :as str]))

(defn reverse-string [s]
  (if (empty? s)
    s
    (let [elements (take (count s) s)]
      (loop [pos (- (count elements) 1)
             elem (nth elements pos)
             final-result []]
        (if (zero? pos)
          (str/join (conj final-result elem))
          (recur (- pos 1) (nth elements (- pos 1)) (conj final-result elem))))
      ))
)

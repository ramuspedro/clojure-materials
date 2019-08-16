(ns clojure-tutorial.core
  (:require [clojure.string :as str])
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn String->Number [str]
  (let [n (read-string str)]
    (if (number? n) n nil)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (def num 1234)

  (def num-str (str num))
  (def num-size (count num-str)) ; size of num string
  (def num-list (str/split num-str #"")) ; convert the number string to a list
  (def num-vector (map String->Number num-list)) ; convert all the strings to number
  ; (def num-exp (map (math/expt 2 num-vector)))
  
  (println (reduce + (for [i num-vector] (math/expt i num-size))))
)


; (for [i [1 2 3]] (+ i 2))
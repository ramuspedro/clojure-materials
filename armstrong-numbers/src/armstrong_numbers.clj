(ns armstrong-numbers
  (:require [clojure.string :as str])
  (:require [clojure.math.numeric-tower :as math]))

(defn String->Number [str]
  (let [n (read-string str)]
    (if (number? n) n nil)))

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here
  (def num-str (str num))
  (def num-size (count num-str)) ; size of num string
  (def num-list (str/split num-str #"")) ; convert the number string to a list
  (def num-vector (map String->Number num-list)) ; convert all the strings to number

  (= num (reduce + (for [i num-vector] (math/expt i num-size))))
)

; (str/split "1234" #"")
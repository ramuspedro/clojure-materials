(ns armstrong-numbers
  (:require [clojure.string :as str])
  (:require [clojure.math.numeric-tower :as math]))

(defn String->Number [str]
  (let [n (read-string str)]
    (if (number? n) n nil)))

(defn armstrong? [num] ;; <- arglist goes here

  (= num (reduce + (for 
                      [i (map String->Number (str/split (str num) #""))] 
                         (math/expt i (count (str num))))))
)

; (str/split "1234" #"")
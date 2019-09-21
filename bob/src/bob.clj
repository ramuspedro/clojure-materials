(ns bob
  (:require [clojure.string :as str]))

(defn has-letter [s]
  (let [alphabet (map char (range 97 123))]
    (reduce (fn [last-result x]
              (or (str/includes? (str/upper-case s) (str/upper-case x)) last-result)) false alphabet))

  )

(defn response-for [s]
  (let [s-has-letter (has-letter s)]
    (cond
      (and (= s (str/upper-case s)) (= "?" (str (last s))) (= s-has-letter true)) "Calm down, I know what I'm doing!"
      (and (= s (str/upper-case s)) (not= "" (str/trim s)) (not= "?" (str (last s))) (= s-has-letter true)) "Whoa, chill out!"
      (and (= "?" (str (last s)))) "Sure."
      (= "" (str/trim s)) "Fine. Be that way!"
      :else "Whatever."
      ))
  )
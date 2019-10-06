(ns rna-transcription
  (:require [clojure.string :as str]))

(defn convert-to-rna
  "method to convertion to rna"
  [elem]
  (case (str elem)
    "C" "G"
    "G" "C"
    "A" "U"
    "T" "A"
    (throw (AssertionError. "Wrong input."))))

(defn to-rna [dna]
  (str/join "" (map convert-to-rna dna))
  )
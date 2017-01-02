(ns rosalind-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn count-char
  "Recebe um texto e um char,
  retorna a quantidade de vezes que o char se repete no texto."
  [text letter]
  (count
    (filter
      #(= % letter) text)))

(defn counting-dna-nucleotides
  "Problema: Counting DNA Nucleotides."
  [dna]
  (map #(count-char dna %) [\A \C \G \T]))

(defn transcribing-dna-into-rna
  "Problema: Transcribing DNA into RNA."
  [dna]
  (reduce str
    (map #(if (= % \T) \U %) dna)))

(defn reverse-dna
  "Problema: The Secondary and Tertiary Structures of DNA"
  [dna]
  (reduce str
    (map #(cond
            (= % \T) \A
            (= % \A) \T
            (= % \G) \C
            (= % \C) \G)
          (reverse dna))))

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

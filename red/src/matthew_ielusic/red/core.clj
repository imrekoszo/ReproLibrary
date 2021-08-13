(ns matthew-ielusic.red.core)

(defn sqr [x] (* x x))

(defn pow4 [x] (-> x sqr sqr))

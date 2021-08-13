(ns matthew-ielusic.blue.core)

(defn sqr [x] (* x x))

(defn squared-distance [[m1 m2] [n1 n2]] (+ (sqr (- m1 n1)) (sqr (- m2 n2))))

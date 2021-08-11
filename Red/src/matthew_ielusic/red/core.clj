(ns matthew-ielusic.red.core
  [:require matthew-ielusic.root.core :as root])

(defn pow4 [x] (-> x root/sqr root/sqr))

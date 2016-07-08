(ns log4j-test.core
  (:require [clojure.tools.logging :as log])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (log/info "Hello, World!"))

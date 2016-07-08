(defproject log4j-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"] [luminus-log4j "0.1.6"]]
  :jvm-opts ["-Dconf=config.edn"]
  :main  log4j-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

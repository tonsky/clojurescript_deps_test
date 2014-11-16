(defproject cljs_libc "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [org.clojure/clojurescript "0.0-2371"]
    [cljs_liba "0.1.0"]
    [cljs_libb "0.1.0"]
  ]
  :plugins [
    [lein-cljsbuild "1.0.3"]
  ]
  :cljsbuild { 
    :builds [
      { :id "release"
        :source-paths ["src"]
        :compiler {
          :output-to     "libc.js"
          :optimizations :advanced
          :pretty-print  true
        }
      }
  ]})

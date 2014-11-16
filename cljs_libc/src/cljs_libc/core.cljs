(ns cljs-libc.core
  (:require
    [cljs-liba.core]
    [cljs-libb.core]))

(enable-console-print!)

(defn ^:export init []
  (cljs-liba.core/foo "X")
  (cljs-libb.core/bar "Y"))

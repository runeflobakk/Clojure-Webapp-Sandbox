(ns webapp-sandbox.server
  (:use ring.adapter.jetty)
  (:require
    [webapp-sandbox.core :as core]
    [clojure.tools.nrepl :as repl]))


(repl/start-server 40501)

(run-jetty core/main-routes {:port 40500})


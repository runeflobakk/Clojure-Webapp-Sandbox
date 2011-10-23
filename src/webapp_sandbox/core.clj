(ns webapp-sandbox.core
  (:use compojure.core, ring.adapter.jetty)
  (:require
    [compojure.route :as route]))

(def homepage "<h1>Hello World</h1>")
(def page-not-found "<h1>Not Found</h1>")


(defroutes main-routes
  (GET "/" [] homepage)
  (route/not-found page-not-found))


(ns serverless-clj.core
  (:require [cheshire.core :as json])
  (:gen-class
    :name serverless-clj
    :methods [^:static [hello [java.util.Map
                               com.amazonaws.services.lambda.runtime.Context]
                        java.util.Map]]))

(defn -hello
  [in ctx]
  {"statusCode" 200
   "body" (json/generate-string {:message "Hello world!"})})


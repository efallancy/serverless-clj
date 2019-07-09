(defproject serverless-clj "1.0.0"
  :description "Simple Clojure AWS Lambda implementation with Serverless"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.amazonaws/aws-lambda-java-core "1.2.0"]
                 [cheshire "5.8.1"]]
  :repl-options {:init-ns serverless-clj.core}
  :uberjar-name "serverless.jar"
  :profiles {:uberjar {:aot :all}})

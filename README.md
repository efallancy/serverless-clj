# Serverless Clj

> ⚡️ 🤖 

Simple AWS Lambda implementation in Clojure using Serverless framework.

## Get started

Make sure [leiningen](https://leiningen.org/) and [Serverless](https://serverless.com) have been installed.

## Deployment

Build the artifact before deployment (*.jar* file) by running the following command:

```sh
lein do clean, uberjar
```

The artifact can be found in *target* folder as *serverless.jar*.

To deploy, run the *Serverless* deploy command:

```sh
serverless deploy
```


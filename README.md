# Serverless Clj

> ⚡️ 🤖 

Simple AWS Lambda implementation in Clojure using Serverless framework.

## Get started

Make sure you have [Leineingen](https://leiningen.org/) and [Serverless](https://serverless.com) installed.

## Deployment

Build the artifact before deployment (_.jar_ file) by running the following command:

```sh
lein do clean, uberjar
```

The artifact can be found in *target* folder as *serverless.jar*.

To deploy, run the *Serverless* deploy command:

```sh
serverless deploy
```


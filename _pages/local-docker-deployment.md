---
title: "Local Docker Deployment"
permalink: /local-docker-deployment/
excerpt: "Build and browser-test local changes using Docker and H2 without configuring a local Wildfly server"
toc: true
sidebar:
  title: "Index"
  nav: docs
---

Use this H2 Docker deployment to build and browser-test local changes without configuring a local Wildfly server.

## Prerequisites

- Maven is installed
- Docker and Docker Compose are installed
- Docker is running

## Build

Build the exploded WAR and content add-in from the project root:

```bash
mvn clean compile skyve:generateDomain war:exploded
```

## Prepare the deployment

Prepare the H2 Docker deployment from the project root:

```bash
mkdir -p docker/h2/content/addins
cp docker/h2/agedCare.json deployments/agedCare.json
cp target/skyve-content-9.4.3.zip docker/h2/content/addins/
touch deployments/agedCare.war.dodeploy
```

## Start the application

```bash
cd docker/h2
docker compose up -d
```

Watch startup until Wildfly reports `Registered web context: '/agedCare'` and `WildFly ... started`:

```bash
docker compose logs -f
```

## Sign in

Open the application at http://localhost:8081/agedCare and sign in with the bootstrap credentials:

```text
Username: setup
Password: setup
```

## Stop the deployment

Stop the local deployment when finished:

```bash
cd docker/h2
docker compose down
```

## Notes

- The Docker Compose deployment uses the H2 database under `docker/h2/content/agedCare_db.*`.
- The local Docker URL uses port `8081`, while a manually configured local Wildfly server commonly uses port `8080`.
- The `skyve-content-*.zip` filename must match the `skyve.version` property in `pom.xml`.
- If deployment fails, check `deployments/agedCare.war.failed` and `docker compose logs`. After correcting the problem, remove the failed marker and recreate `deployments/agedCare.war.dodeploy`.

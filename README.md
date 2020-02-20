# Java with SpringBoot + Togglz

Project startup with Docker, Java and Spring Boot + Togglz.

After setting up the environment, you will have a working installation of Togglz, including Web Console.

The goal of this project is to have a local environment where it is possible to build, run the Spring Boot-CLI and run the application from the command line.

In other words, you will have to manually setup your IDE and integration with JDK.

Besides this, with the default configuration, the `.m2` folder will be shared between the host machine and the Docker container and will be cached in multiple runs. 

## Requirements

- Git
- Docker
- Docker Compose

## Installation

```
git clone git@github.com:fernandohu/quickstart-java-springboot-maven.git 
docker-compose up
```

## Application access

Open the web browser at: http://localhost:8081/greeting.

To access the Togglz console at: http://localhost:8081/togglz-console.

## Routine tasks

- Source code at /app.

#### Building the project

```
docker-compose run --rm java mvn clean install
```

#### Running tests

```
docker-compose run --rm java mvn test
```

#### Running Spring Boot Cli

```
docker-compose run --rm java spring --version
```

#### Running the application

```
docker-compose up
```

Castor is a sample Java application that simulates a podcasting platform. The intention of the project is to become familiar with and demonstrate the following concepts and technologies:

* Hexagonal Architecture
* Java Modules
* Application Security
* Docker multi-stage builds
* Spring Boot

## Architecture Overview
The application consists of the following modules:

- `api` - The data transfer objects used by the Rest API.
- `core` - The domain library that defines the core function of the app. Should have no dependencies to other modules.
- `feature` - A feature flag module that can be leveraged in other modules.
- `persistence` - Implements the persistence layer using Mybatis and PostgreSQL. Depends on core.
- `security` - Implements the security configuration. No internal dependencies.
- `server` - The main module that pulls everything together. Depends on Spring Boot and all other modules (except the UI).
- `ui` - An experimental JavaFX UI that calls the Rest API.

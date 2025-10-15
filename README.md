# Java Gradle Spring Boot Demo

A production-ready Spring Boot application demonstrating best practices for containerized Java applications with comprehensive test coverage.

## Technology Stack

- Java 17 - LTS version with modern language features
- Spring Boot 3.5.6 - Latest Spring Boot framework
- Gradle 8 - Dependency management and build automation
- JUnit 5 - Modern testing framework
- JaCoCo 0.8.12 - Code coverage analysis with 80% minimum threshold
- Checkstyle 10.20.2 - KubeRocketCI standard (4-space indentation)
- Docker - Alpine-based containerization with optimized JRE image

## Architecture Approach

### Containerization

- Multi-stage Docker build with Eclipse Temurin JRE 17
- Security hardened - runs as non-root user (`nobody:nogroup`)
- Optimized startup - uses `exec` for proper signal handling (PID 1)
- Runtime configuration - JVM options via `$JAVA_OPTS` environment variable

### Testing Strategy

- Unit tests with `@WebMvcTest` for controller layer
- Integration tests with `@SpringBootTest` for application context
- Coverage enforcement - JaCoCo checks minimum 80% code coverage
- Excludes - Application main class excluded from coverage metrics

### Code Quality

- Automated test execution during Gradle build lifecycle
- Coverage reports - HTML, XML, and CSV formats
- Checkstyle with KubeRocketCI standards (4-space indentation)
- CI/CD ready - Fail-fast on coverage violations

## Quick Start

### Build and Run

```bash
# Build the application
./gradlew clean build

# Run tests with coverage
./gradlew test jacocoTestReport

# Run with coverage check
./gradlew check

# Run checkstyle
./gradlew checkstyleMain checkstyleTest

# Run the application from build
java -jar build/libs/*.jar

# Run the application
./gradlew bootRun
```

### Docker

```bash
# Build image
docker build -t java-gradle-springboot:latest .

# Run container
docker run -p 8080:8080 \
  -e JAVA_OPTS="-Xmx512m -Xms256m" \
  java-gradle-springboot:latest
```

### API Endpoints

- `GET /api/hello` - Returns greeting message

## Test Coverage

View coverage reports after running tests:

```bash
open build/reports/jacoco/test/html/index.html
```

Current coverage: 100% of application code

## Code Quality Reports

View checkstyle reports:

```bash
open build/reports/checkstyle/main.html
open build/reports/checkstyle/test.html
```

**Coding Standards:**
- 4-space indentation
- Static imports before regular imports
- Line length max 120 characters
- Full Checkstyle compliance (0 violations)

## Learn More

This demo is part of the [KubeRocketCI](https://docs.kuberocketci.io) platform, which provides a complete CI/CD solution for Kubernetes-native applications.

For comprehensive guides on building cloud-native applications with KubeRocketCI, visit the [official documentation](https://docs.kuberocketci.io).

## License

Apache License 2.0

# Build stage for senpai-common
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# Final stage
FROM maven:3.9-eclipse-temurin-17
WORKDIR /app
COPY --from=build /app/target/senpai-common-1.0.0.jar ./senpai-common-1.0.0.jar
CMD ["mvn", "install:install-file", "-Dfile=senpai-common-1.0.0.jar", "-DgroupId=bg.senpai", "-DartifactId=senpai-common", "-Dversion=1.0.0", "-Dpackaging=jar"]


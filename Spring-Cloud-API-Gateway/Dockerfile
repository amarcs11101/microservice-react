############ build stage #############
FROM maven:3.8.4-openjdk-11-slim AS builder
RUN mkdir -p /app/api-gateway
COPY . /app/api-gateway
WORKDIR /app/api-gateway
COPY pom.xml .
RUN mvn dependency:go-offline
RUN mvn package

############# Deployment Stage ###########
FROM openjdk:11-jre-slim as deployment
WORKDIR /app/api-gateway
COPY --from=builder /app/api-gateway/target/api-gateway-0.0.1-SNAPSHOT.jar ./  
ENTRYPOINT ["java", "-jar", "/app/api-gateway/api-gateway-0.0.1-SNAPSHOT.jar"]

# END
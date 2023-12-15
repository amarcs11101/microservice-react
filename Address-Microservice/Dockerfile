############ build stage #############
FROM maven:3.8.4-openjdk-11-slim AS builder
RUN mkdir -p /app/address-service
COPY . /app/address-service
WORKDIR /app/address-service
COPY pom.xml .
RUN mvn dependency:go-offline
RUN mvn package

############# Deployment Stage ###########
FROM openjdk:11-jre-slim as deployment
WORKDIR /app/address-service
COPY --from=builder /app/address-service/target/address-service-0.0.1-SNAPSHOT.jar ./  
ENTRYPOINT ["java", "-jar", "/app/address-service/address-service-0.0.1-SNAPSHOT.jar"]

# END
############ build stage #############
FROM maven:3.8.4-openjdk-11-slim AS builder
RUN mkdir -p /app/eureka-server
COPY . /app/eureka-server
WORKDIR /app/eureka-server
COPY pom.xml .
RUN mvn dependency:go-offline
RUN mvn package

############# Deployment Stage ###########
FROM openjdk:11-jre-slim as deployment
WORKDIR /app/eureka-server
COPY --from=builder /app/eureka-server/target/eureka-server-0.0.1-SNAPSHOT.jar ./  
ENTRYPOINT ["java", "-jar", "/app/eureka-server/eureka-server-0.0.1-SNAPSHOT.jar"]

# END
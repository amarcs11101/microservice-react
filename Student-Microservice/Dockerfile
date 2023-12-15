############ build stage #############
FROM maven:3.8.4-openjdk-11-slim AS builder
RUN mkdir -p /app/student-service
COPY . /app/student-service
WORKDIR /app/student-service
COPY pom.xml .
RUN mvn dependency:go-offline
RUN mvn package

############# Deployment Stage ###########
FROM openjdk:11-jre-slim as deployment
WORKDIR /app/student-service
COPY --from=builder /app/student-service/target/student-service-0.0.1-SNAPSHOT.jar ./  
ENTRYPOINT ["java", "-jar", "/app/student-service/student-service-0.0.1-SNAPSHOT.jar"]

# END
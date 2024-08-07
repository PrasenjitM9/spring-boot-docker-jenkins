FROM openjdk:17-alpine

COPY target/spring-boot-project-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

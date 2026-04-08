
FROM eclipse-temurin:25-jre-alpine
WORKDIR /app

COPY build/libs/*.jar app.jar
EXPOSE 8443
ENTRYPOINT ["java", "-jar", "app.jar"]

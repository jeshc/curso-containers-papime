FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/productos-0.0.1-SNAPSHOT.jar product-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "product-service.jar"]

# Usa una imagen base de Java 17 con Alpine (ligera)
FROM eclipse-temurin:17-jdk-alpine

# Crea un directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el JAR compilado al contenedor
COPY target/clientes-0.0.1-SNAPSHOT.jar app.jar

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]
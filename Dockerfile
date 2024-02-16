FROM openjdk:11
COPY ./target/scientific_calculator-1.0-SNAPSHOT.jar /app/
WORKDIR /app
CMD ["java", "-jar", "scientific_calculator-1.0-SNAPSHOT.jar"]

FROM openjdk:8
COPY ./target/scientific_calculator-1.0-SNAPSHOT.jar./
WORKDIR ./
CMD ["java","-cp","scientific_calculator-1.0-SNAPSHOT.jar","org.example.Main"]

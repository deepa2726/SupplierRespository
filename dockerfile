FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/46330748_SupplierProject.jar
WORKDIR .
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
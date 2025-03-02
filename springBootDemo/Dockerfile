FROM --platform=linux/amd64 amazoncorretto:11-alpine-jdk
#ARG JAR_FILE=springBootDemo/target/spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080

COPY ../../target/springBootDemo-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]
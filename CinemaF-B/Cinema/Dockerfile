FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/Cinema*.jar /app.jar
CMD ["java","-jar","/app.jar", "--spring.profiles.active=prod"]
EXPOSE 8080

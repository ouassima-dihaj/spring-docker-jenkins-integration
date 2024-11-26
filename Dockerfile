FROM openjdk:17
EXPOSE 8080
ADD target/spring-devops.jar spring-devops.jar
ENTRYPOINT ["java","-jar","/spring-devops.jar"]
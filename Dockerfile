FROM openjdk:8
EXPOSE 8085
ADD target/microservice1.jar microservice1
ENTRYPOINT ["java","-jar","/microservice1.jar"]
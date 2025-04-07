FROM openjdk:21-jdk

EXPOSE 8080

ADD target/aws-order-service.jar aws-order-service.jar

ENTRYPOINT ["java", "-jar", "aws-order-service.jar"]
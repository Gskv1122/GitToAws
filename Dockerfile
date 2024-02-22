FROM eclipse-temurin:17
COPY target/GitAws.jar GitAws.jar 
CMD ["java","-jar","GitAws.jar"]
FROM amazoncorretto:8
COPY ./build/libs/seedling-0.0.1-SNAPSHOT.jar seedling-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "seedling-0.0.1-SNAPSHOT.jar"]

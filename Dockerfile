FROM gradle:7.3.1-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon


FROM amazoncorretto:8
COPY --from=build /home/gradle/src/build/libs/*.jar .
CMD ["java", "-jar", "seedling-0.0.1-SNAPSHOT.jar"]
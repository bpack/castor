FROM adoptopenjdk/openjdk11:jdk-11.0.7_10-alpine as builder

WORKDIR app
ARG JAR_FILE=castor-server/build/libs/*.jar

COPY ${JAR_FILE} app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM adoptopenjdk/openjdk11:jre-11.0.7_10-alpine
WORKDIR app
COPY --from=builder app/dependencies/ ./
COPY --from=builder app/snapshot-dependencies/ ./
COPY --from=builder app/spring-boot-loader/ ./
COPY --from=builder app/application/ ./

CMD ["java", "org.springframework.boot.loader.JarLauncher"]



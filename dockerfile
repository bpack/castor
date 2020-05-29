FROM adoptopenjdk/openjdk11:jdk-11.0.7_10-alpine

ARG BUILD_DIR=castor-server/build

WORKDIR /opt/castor
COPY ${BUILD_DIR}/modules/lib/* ./modules/
COPY ${BUILD_DIR}/libs/*.jar ./application.jar

CMD ["java", "-p", "/opt/castor/:/opt/castor/modules/", \
    "-m", "com.ioglyph.castor.server/com.ioglyph.castor.server.application.CastorServer"]


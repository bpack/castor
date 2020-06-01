FROM adoptopenjdk/openjdk11:jre-11.0.7_10-alpine

ARG BUILD_DIR=castor-application/build

WORKDIR /opt/castor
COPY ${BUILD_DIR}/modules/lib/* ./modules/
COPY ${BUILD_DIR}/libs/*.jar ./application.jar

CMD ["java", "-p", "/opt/castor/:/opt/castor/modules/", \
    "-m", "com.ioglyph.castor.application/com.ioglyph.castor.application.CastorServer"]


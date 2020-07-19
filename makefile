OWNER ?= bpack
REPO ?= castor
VERSION ?= latest

BUILD_DIR ?= castor-application/target/
APP_JAR ?= $(BUILD_DIR)/castor-application-0.0.1-SNAPSHOT.jar

build:
	mvn test package

clean:
	mvn clean

run: build
	java -p $(APP_JAR):$(BUILD_DIR)/modules/lib/:$(BUILD_DIR)/target/modules/application/ \
		-m com.ioglyph.castor.application/com.ioglyph.castor.application.CastorServer || true

docker.build:
	docker build -t $(OWNER)/$(REPO):$(VERSION) .

docker.shell:
	docker run --rm -i -t $(OWNER)/$(REPO):$(VERSION) /bin/sh

docker.run:
	docker-compose up

cleanall: clean
	docker-compose rm
	docker rmi -f $(OWNER)/$(REPO)

.PHONY: build clean docker.build docker.shell docker.run cleanall

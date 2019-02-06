#!/bin/sh
PROJECTID=$(curl -s "http://metadata.google.internal/computeMetadata/v1/project/project-id" -H "Metadata-Flavor: Google")
echo "Project ID: ${PROJECTID}"

update-alternatives --set java /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java

gsutil cp gs://dev-install/bookstore-server.jar /home/alexsandrospecht/bookstore-server.jar
java -jar /home/alexsandrospecht/bookstore-server.jar
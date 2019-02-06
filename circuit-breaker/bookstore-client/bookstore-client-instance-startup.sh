#!/bin/sh
PROJECTID=$(curl -s "http://metadata.google.internal/computeMetadata/v1/project/project-id" -H "Metadata-Flavor: Google")
echo "Project ID: ${PROJECTID}"

update-alternatives --set java /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java

gsutil cp gs://dev-install/bookstore-client.jar /home/alexsandrospecht/bookstore-client.jar
java -Dbookstore-server-ip=http://bookstore-server-1 -Dserver.port=8080 -jar /home/alexsandrospecht/bookstore-client.jar
FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 8082

RUN mkdir -p /files

COPY /files /files

ARG JAR_FILE

COPY target/*.jar app.jar

ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS \
 -Djava.security.egd=file:/dev/./urandom \
 -Dspring.profiles.active=$SPRING_PROFILE \
#  -javaagent:applicationinsights-agent-3.0.2.jar \
 -jar app.jar
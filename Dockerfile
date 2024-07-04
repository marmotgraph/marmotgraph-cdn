FROM eclipse-temurin:21-jre-alpine
VOLUME /tmp
COPY target/*.jar marmotgraph-cdn.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -jar /marmotgraph-cdn.jar
FROM public.ecr.aws/docker/library/eclipse-temurin:17-jre-alpine

ENV JAVA_OPTS="-Xmx512m -Xms256m -Djava.security.egd=file:/dev/./urandom" \
    SPRING_PROFILES_ACTIVE=prod

USER nobody:nogroup
WORKDIR /app

COPY --chown=nobody:nogroup build/libs/*.jar /app/app.jar

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar /app/app.jar"]

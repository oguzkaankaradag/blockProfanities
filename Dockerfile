FROM eclipse-temurin:17

LABEL maintainer="karadagoguzkaan@gmai.com"

WORKDIR /app

COPY    /target/Profanity-0.0.1-SNAPSHOT.jar /app/Profanity-0.0.1.jar

ENTRYPOINT ["java", "-jar", "Profanity-0.0.1.jar"]
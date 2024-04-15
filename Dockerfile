FROM azul/zulu-openjdk:17

WORKDIR /app

COPY target/auth-0.0.1-SNAPSHOT.jar /app/auth-0.0.1-SNAPSHOT.jar

EXPOSE 9090

CMD ["java", "-jar","auth-0.0.1-SNAPSHOT.jar"]

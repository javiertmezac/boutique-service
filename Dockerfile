FROM openjdk:11
MAINTAINER javiermeza.cazarez@gmail.com

COPY boutique-server/target/boutique-server-shaded.jar /app/server.jar

EXPOSE 8080

CMD [ "-cp", "/app/server.jar", "com.jtmc.apps.boutique.Launcher"]
ENTRYPOINT ["java"]
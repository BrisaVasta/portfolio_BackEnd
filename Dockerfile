FROM amazoncorretto:17
MAINTAINER brisav
COPY target/portfolioSpring-0.0.1-SNAPSHOT.jar portfolioSpring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/portfolioSpring-0.0.1-SNAPSHOT.jar"]


FROM maven:3-amazoncorretto-17

WORKDIR /awesome-bank-web
COPY . .
RUN mvn clean
RUN mvn install -DskipTests
RUN mvn test

CMD mvn spring-boot:run
FROM openjdk:21-jdk
WORKDIR /app
COPY . /app
RUN javac test.java
ENTRYPOINT ["java", "test"]
FROM openjdk:11
COPY . /usr/src/animals
WORKDIR /usr/src/animals
RUN javac -cp .:lib/mariadb-java-client-3.3.0.jar:lib/json-simple-1.1.1.jar Main.java
CMD ["java", "-cp", ".:lib/mariadb-java-client-3.3.0.jar:lib/json-simple-1.1.1.jar", "Main"]
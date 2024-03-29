FROM openjdk:11
COPY . /usr/src/animals
WORKDIR /usr/src/animals
RUN sh builder.sh
CMD ["java", "--module-path", "mods", "--module", "lando.mel.envreader/lando.mel.envreader.Main"]
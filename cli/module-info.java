module lando.mel.cli {
    exports lando.mel.cli;

    opens lando.mel.cli to picocli;

    requires picocli;
}

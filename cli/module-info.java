module lando.mel.cli {
    exports lando.mel.cli.api;

    opens lando.mel.cli.api to picocli;

    requires picocli;
}

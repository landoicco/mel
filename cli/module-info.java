module lando.mel.cli {
    requires picocli;

    provides lando.mel.cli.api.CLI with lando.mel.cli.implementation.MelCLI;

    opens lando.mel.cli.implementation to picocli;
}

module lando.mel.cli {
    requires picocli;

    uses lando.mel.cli.api.CLI;

    opens lando.mel.cli.implementation to picocli;
    opens lando.mel.cli.implementation.crud to picocli;

    provides lando.mel.cli.api.CLI with lando.mel.cli.implementation.MelCLI;

    exports lando.mel.cli.implementation;
}

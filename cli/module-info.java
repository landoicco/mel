module lando.mel.cli {
    requires picocli;

    uses lando.mel.cli.api.CLI;

    provides lando.mel.cli.api.CLI with lando.mel.cli.implementation.MelCLI;

    exports lando.mel.cli.api;

}

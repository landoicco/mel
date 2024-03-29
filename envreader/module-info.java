module lando.mel.envreader {
    exports lando.mel.envreader.api;
    exports lando.mel.envreader.lookup;

    uses lando.mel.envreader.api.EnvironmentVariableProvider;
    provides lando.mel.envreader.api.EnvironmentVariableProvider with lando.mel.envreader.impl.LocalEnvironmentVariablesProvider;
}
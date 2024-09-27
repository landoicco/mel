package lando.mel.envreader.api;

import java.nio.file.Path;

public interface EnvironmentVariableProvider {
    String getVariableKey(Path path, String value);

    String getVariableValue(Path path, String key);
}

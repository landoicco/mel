package lando.mel.cli.api;

import java.util.HashMap;

public interface CLI {
    void GatherDataWithCLI(String[] args);

    HashMap<String, String> getMapData();
}

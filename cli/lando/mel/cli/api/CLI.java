package lando.mel.cli.api;

import java.util.HashMap;

public interface CLI {
    HashMap<String, String> GatherDataWithCLI(String[] args);

    HashMap<String, String> getMapData();
}

package lando.mel.envreader;

import lando.mel.envreader.impl.LocalEnvironmentVariablesProvider;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path p = Path.of(".env");
        LocalEnvironmentVariablesProvider provider = new LocalEnvironmentVariablesProvider();
        String s1 = provider.getVariableKey(p, "value1");
        System.out.println(s1);

        String s2 = provider.getVariableValue(p, "KEY2");
        System.out.println(s2);
    }
}

package lando.mel.envreader;

import lando.mel.envreader.api.EnvironmentVariableProvider;
import lando.mel.envreader.lookup.ServiceProvider;

import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path p = Path.of(".env");

        // Test on service lookup package
        EnvironmentVariableProvider single = ServiceProvider.FindSingleEnvironmentVariableProvider();
        List<EnvironmentVariableProvider> list = ServiceProvider.FindAllEnvironmentVariableProvider();
        System.out.println("Service found! -> " + single);
        System.out.println("List of services found! -> " + list);

        String s1 = single.getVariableKey(p, "value1");
        System.out.println(s1);

        String s2 = single.getVariableValue(p, "KEY2");
        System.out.println(s2);
    }
}

package lando.mel.envreader.lookup;

import lando.mel.envreader.api.EnvironmentVariableProvider;

import java.util.List;
import java.util.ArrayList;
import java.util.ServiceLoader;

public class ServiceProvider {
    public static EnvironmentVariableProvider FindSingleEnvironmentVariableProvider() {
        ServiceLoader<EnvironmentVariableProvider> loader = ServiceLoader.load(EnvironmentVariableProvider.class);
        for (EnvironmentVariableProvider p : loader) {
            return p;
        }

        return null;
    }

    public static List<EnvironmentVariableProvider> FindAllEnvironmentVariableProvider() {
        List<EnvironmentVariableProvider> services = new ArrayList<>();
        ServiceLoader<EnvironmentVariableProvider> loader = ServiceLoader.load(EnvironmentVariableProvider.class);
        for (EnvironmentVariableProvider p : loader) {
            services.add(p);
        }

        return services;
    }
}

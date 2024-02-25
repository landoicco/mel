package lando.mel.app.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import lando.mel.cli.api.CLI;

public class ServiceProvider {
    public static CLI findSingleCLIService() {
        ServiceLoader<CLI> loader = ServiceLoader.load(CLI.class);
        for (CLI cli : loader) {
            return cli;
        }

        return null;
    }

    public static List<CLI> findAllCLIServices() {
        List<CLI> services = new ArrayList<>();
        ServiceLoader<CLI> loader = ServiceLoader.load(CLI.class);
        for (CLI cli : loader) {
            services.add(cli);
        }

        return services;
    }
}

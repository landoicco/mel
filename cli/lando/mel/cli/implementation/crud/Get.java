package lando.mel.cli.implementation.crud;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

public class Get {
    @Command(name = "get", mixinStandardHelpOptions = true)
    public static class SelectEntries implements Runnable {

        @Option(names = { "-A", "--all" }, defaultValue = "false", description = "Show all sotred data in tables")
        private boolean all;

        @Option(names = { "-n",
                "--name" }, defaultValue = "none", description = "Name of the entry to show", paramLabel = "name")
        private String name;

        @Override
        public void run() {
            if (all) {
                System.out.println("print all entries");
                return;
            }
            System.out.println("Get animal called" + name);
        }

    }
}

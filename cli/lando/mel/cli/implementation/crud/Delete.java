package lando.mel.cli.implementation.crud;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

public class Delete {
    @Command(name = "delete", mixinStandardHelpOptions = true)
    public static class DeleteEntries implements Runnable {

        @Option(names = { "-n",
                "--name" }, defaultValue = "none", description = "Name of the entry to show", paramLabel = "name")
        private String name;

        @Override
        public void run() {
            System.out.println("Delete animal called" + name);
        }

    }
}

package lando.mel.cli.implementation.crud;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

public class Edit {
    @Command(name = "edit", mixinStandardHelpOptions = true)
    public static class ModifyExistingEntry implements Runnable {
        @Option(names = { "-n",
                "--name" }, defaultValue = "none", description = "Enter name or id of animal to edit", paramLabel = "name")
        private String name;

        @Override
        public void run() {
            System.out.println("edit animal called" + name);
        }

    }
}

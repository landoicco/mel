package lando.mel.cli;

import picocli.CommandLine;
import static picocli.CommandLine.Command;
import static picocli.CommandLine.Option;
import static picocli.CommandLine.Parameters;

public class MelCLI {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new HelloCommand()).execute(args);
        System.exit(exitCode);
    }

    @Command(subcommands = {
            CreateNewEntry.class,
            ModifyExistingEntry.class,
            SelectEntries.class,
            DeleteEntries.class
    }, name = "Mel", description = "General data and vaccine records manager for domestic animals", mixinStandardHelpOptions = true, version = "Mel 0.1")
    static class HelloCommand implements Runnable {
        @Option(names = { "create" }, defaultValue = "false", description = "Create new animal entry")
        private boolean create;

        @Option(names = { "edit" }, defaultValue = "false", description = "Modify existing animal entry")
        private boolean edit;

        @Option(names = { "get" }, defaultValue = "false", description = "Get existing animal entry")
        private boolean get;

        @Option(names = { "delete" }, defaultValue = "false", description = "Delete existing animal entry")
        private boolean delete;

        @Override
        public void run() {
        }
    }

    @Command(name = "create", mixinStandardHelpOptions = true)
    static class CreateNewEntry implements Runnable {

        @Override
        public void run() {
            System.out.println("Create animal called");
            // CatCLICreator.getDataFromUser();
        }

    }

    @Command(name = "edit", mixinStandardHelpOptions = true)
    static class ModifyExistingEntry implements Runnable {
        @Option(names = { "-n",
                "--name" }, defaultValue = "none", description = "Enter name or id of animal to edit", paramLabel = "name")
        private String name;

        @Override
        public void run() {
            System.out.println("edit animal called" + name);
        }

    }

    @Command(name = "get", mixinStandardHelpOptions = true)
    static class SelectEntries implements Runnable {

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

    @Command(name = "delete", mixinStandardHelpOptions = true)
    static class DeleteEntries implements Runnable {

        @Option(names = { "-n",
                "--name" }, defaultValue = "none", description = "Name of the entry to show", paramLabel = "name")
        private String name;

        @Override
        public void run() {
            System.out.println("Delete animal called" + name);
        }

    }
}
package lando.mel.cli.implementation;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import static picocli.CommandLine.Option;

import java.util.HashMap;

import lando.mel.cli.api.CLI;
import lando.mel.cli.utils.DataBucket;

import static lando.mel.cli.implementation.crud.Create.CreateNewEntry;
import static lando.mel.cli.implementation.crud.Edit.ModifyExistingEntry;
import static lando.mel.cli.implementation.crud.Get.SelectEntries;
import static lando.mel.cli.implementation.crud.Delete.DeleteEntries;

public class MelCLI implements CLI {
    public void GatherDataWithCLI(String[] args) {
        int exitCode = new CommandLine(new HelloCommand()).execute(args);
        System.exit(exitCode);
    }

    public HashMap<String, String> getMapData() {
        return DataBucket.getData();
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
}
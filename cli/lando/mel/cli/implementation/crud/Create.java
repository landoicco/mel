package lando.mel.cli.implementation.crud;

import lando.mel.cli.creators.CatCLICreator;
import lando.mel.cli.creators.DogCLICreator;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

public class Create {
    @Command(name = "create", mixinStandardHelpOptions = true)
    public static class CreateNewEntry implements Runnable {
        @Parameters(index = "0", description = "Type of @|fg(green) animal|@ to create.", paramLabel = "animal")
        private String animal;

        @Override
        public void run() {
            switch (animal) {
                case "cat":
                    CatCLICreator.getDataFromUser();
                    break;
                case "dog":
                    DogCLICreator.getDataFromUser();
                    break;
                default:
                    System.out.println("Animal not available");
            }
        }

    }
}

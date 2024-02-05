package lando.mel.cli.implementation.crud;

import java.util.HashMap;

import lando.mel.cli.creators.CatCLICreator;
import lando.mel.cli.creators.DogCLICreator;
import lando.mel.cli.utils.DataBucket;

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
                    HashMap<String, String> catData;
                    catData = CatCLICreator.getDataFromUser();
                    DataBucket.setData(catData);
                    break;
                case "dog":
                    HashMap<String, String> dogData;
                    dogData = DogCLICreator.getDataFromUser();
                    DataBucket.setData(dogData);
                    break;
                default:
                    System.out.println("Animal not available");
            }
        }

    }
}

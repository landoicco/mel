package lando.mel.cli;

import java.io.Console;

// import helpers.JsonAnimalCreator;

public class CatCLICreator {
    public static void getDataFromUser() {
        Console console = System.console();
        if (console == null) {
            System.err.println("Console not available!");
            return;
        }

        console.writer().println("=> Enter the new cat name:");
        String catName = console.readLine();
        console.writer().println("=> Is male or female? (m/f)");
        String gender = console.readLine();
        console.writer().println("=> Enter the birth date! In this format dd-mm-yyyy");
        String birthDate = console.readLine();
        // console.writer().println(JsonAnimalCreator.getAnimalJsonAsString(new String[]
        // { catName, gender, birthDate }));
        console.writer().println("You entered: " + catName + gender + birthDate);
    }
}

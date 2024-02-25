package lando.mel.cli.creators;

import static lando.mel.cli.utils.StringUtils.*;
import static lando.mel.cli.constants.DogConstants.*;

import java.io.Console;
import java.util.HashMap;

public class DogCLICreator {
    public static HashMap<String, String> getDataFromUser() {
        HashMap<String, String> data = new HashMap<>();

        Console console = System.console();
        if (console == null) {
            System.err.println("Console not available!");
            return null;
        }

        // Print hello message and example
        console.writer().println(DOG_CREATOR_HELLO_MESSAGE);
        console.writer().println();
        console.writer().println(AnsiString(DOG_CREATOR_EXAMPLE));
        console.writer().println();

        // Get data from user
        for (String field : DOG_DATA_FIELDS) {
            console.writer().println(AnsiString("Enter @|bold,green,underline " + field + "|@:"));
            data.put(field, console.readLine());
        }

        // Show gathered data to user
        console.writer().println();
        console.writer().println(LINE_BREAK);

        console.writer()
                .println(AnsiString(
                        "@|bold The following data will be stored in the system. Is correct?|@"));
        console.writer().println();

        console.writer().println(AnsiString("@|cyan {|@"));
        data.forEach((key, value) -> console.writer()
                .println(AnsiString("  @|cyan " + key + "|@: " + value)));
        console.writer().println(AnsiString("@|cyan }|@"));
        console.writer().println();
        console.writer()
                .println(AnsiString(
                        "Press any key for @|green,bold yes|@, press \'n\' for @|red,bold no|@"));

        // Request user confirmation before sending the data
        switch (console.readLine()) {
            case "n":
                getDataFromUser();
            default:
                return data;
        }
    }
}

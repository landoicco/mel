package lando.mel.cli.creators;

import picocli.CommandLine.Help.Ansi;

import java.io.Console;
import java.util.HashMap;
import java.util.List;

public class CatCLICreator {

    private static final String HELLO_MESSAGE = Ansi.AUTO.string("@|bold,yellow == MEL: CAT CREATOR == |@");

    // Temporal example
    private static final String EXAMPLE = String.join("\n",
            "=============================================",
            "@|bold Enter the following data of the new cat to add: |@",
            " @|green name|@  # The \"fullname\" of the cat",
            " @|green alias|@ # Short name of the cat",
            " @|green gender|@ # Enter (f) for female and (m) for male",
            " @|green birthDate|@ # If known, enter the birth date of the cat",
            " @|green joinerSince|@ # Enter the date the cat join the family",
            " @|green color|@ # Color or colors of the cat",
            " @|green isSterilized|@ # Enter (true) for yes, (false) for no",
            " @|green alive|@ # Enter (true) for yes, (false) for no",
            "=============================================");

    private static final List<String> FIELDS = List.of(
            "name",
            "alias",
            "gender",
            "birthDate",
            "joinerSince",
            "color",
            "isSterilized",
            "alive");

    public static HashMap<String, String> getDataFromUser() {
        HashMap<String, String> data = new HashMap<>();

        Console console = System.console();
        if (console == null) {
            System.err.println("Console not available!");
            return null;
        }

        // Print hello message and example
        console.writer().println(HELLO_MESSAGE);
        console.writer().println();
        console.writer().println(Ansi.AUTO.string(EXAMPLE));
        console.writer().println();

        // Get data from user
        for (String field : FIELDS) {
            console.writer().println(Ansi.AUTO.string("Enter @|bold,green,underline " + field + "|@:"));
            data.put(field, console.readLine());
        }

        // Show gathered data to user
        console.writer().println();
        console.writer().println("=============================================");

        console.writer()
                .println(Ansi.AUTO.string("@|bold The following data will be stored in the system. Is correct?|@"));
        console.writer().println();

        console.writer().println(Ansi.AUTO.string("@|cyan {|@"));
        data.forEach((key, value) -> console.writer().println(Ansi.AUTO.string("  @|cyan " + key + "|@: " + value)));
        console.writer().println(Ansi.AUTO.string("@|cyan }|@"));
        console.writer().println();
        console.writer()
                .println(Ansi.AUTO.string("Press any key for @|green,bold yes|@, press \'n\' for @|red,bold no|@"));

        // Request user confirmation before sending the data
        switch (console.readLine()) {
            case "n":
                getDataFromUser();
                return null;
        }

        return data;
    }
}

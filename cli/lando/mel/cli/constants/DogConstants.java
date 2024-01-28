package lando.mel.cli.constants;

import static lando.mel.cli.utils.StringUtils.*;

import java.util.List;

public class DogConstants {
        public final static String DOG_CREATOR_HELLO_MESSAGE = AnsiString("@|bold,yellow == MEL: DOG CREATOR == |@");

        // Temporal example
        public final static String DOG_CREATOR_EXAMPLE = String.join("\n",
                        LINE_BREAK,
                        "@|bold Enter the following data of the new dog to add: |@",
                        " @|green name|@             # The \"fullname\" of the dog",
                        " @|green alias|@            # Short name of the dog",
                        " @|green gender|@           # Enter (f) for female and (m) for male",
                        " @|green birthDate|@        # If known, enter the birth date of the dog",
                        " @|green joinerSince|@      # Enter the date the dog join the family",
                        " @|green color|@            # Color or colors of the dog",
                        " @|green breed|@            # Enter the dog breed or breeds",
                        " @|green isSterilized|@     # Enter (true) for yes, (false) for no",
                        " @|green alive|@            # Enter (true) for yes, (false) for no",
                        LINE_BREAK);

        // Expected dog data by lando.mel.cli
        public final static List<String> DOG_DATA_FIELDS = List.of(
                        "name",
                        "alias",
                        "gender",
                        "birthDate",
                        "joinerSince",
                        "color",
                        "breed",
                        "isSterilized",
                        "alive");
}

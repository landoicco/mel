package lando.mel.cli.constants;

import static lando.mel.cli.utils.StringUtils.*;

import java.util.List;

public class CatConstants {
        public final static String CAT_CREATOR_HELLO_MESSAGE = AnsiString("@|bold,yellow == MEL: CAT CREATOR == |@");

        // Temporal example
        public final static String CAT_CREATOR_EXAMPLE = String.join("\n",
                        LINE_BREAK,
                        "@|bold Enter the following data of the new cat to add: |@",
                        " @|green name|@             # The \"fullname\" of the cat",
                        " @|green alias|@            # Short name of the cat",
                        " @|green gender|@           # Enter (f) for female and (m) for male",
                        " @|green birthDate|@        # If known, enter the birth date of the cat",
                        " @|green joinerSince|@      # Enter the date the cat join the family",
                        " @|green color|@            # Color or colors of the cat",
                        " @|green isSterilized|@     # Enter (true) for yes, (false) for no",
                        " @|green alive|@            # Enter (true) for yes, (false) for no",
                        LINE_BREAK);

        // Expected cat data by lando.mel.cli
        public final static List<String> CAT_DATA_FIELDS = List.of(
                        "name",
                        "alias",
                        "gender",
                        "birthDate",
                        "joinerSince",
                        "color",
                        "isSterilized",
                        "alive");
}

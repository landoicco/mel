package lando.mel.cli.utils;

import picocli.CommandLine.Help.Ansi;

public class StringUtils {

    public final static String LINE_BREAK = "========================================================";

    public static String AnsiString(String s) {
        return Ansi.AUTO.string(s);
    }
}

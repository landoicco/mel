package lando.mel.cli.utils;

import picocli.CommandLine.Help.Ansi;

public class StringUtils {
    public static String AnsiString(String s) {
        return Ansi.AUTO.string(s);
    }

    public static String LineBreak() {
        return "========================================================";
    }
}

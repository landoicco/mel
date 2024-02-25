package lando.mel.cli.utils;

import java.util.HashMap;

public class DataBucket {
    private static HashMap<String, String> data;

    public static HashMap<String, String> getData() {
        return data;
    }

    public static void setData(HashMap<String, String> data) {
        DataBucket.data = data;
    }
}

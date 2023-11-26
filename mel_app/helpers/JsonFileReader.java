package helpers;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;

public class JsonFileReader {

    // Print to console all the contents of the file
    public static void printJsonData() {
        Path path = Paths.get("lib/data.json");
        try(var s = Files.lines(path)) {
            s.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
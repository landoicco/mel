package helpers;

import java.util.Map;
import java.util.HashMap;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReader {

    // Path where the json file lives
    private static Path path = Paths.get("lib/data.json");
    private static Map<String, JSONArray> animals = new HashMap<>();

    // Print to console all the contents of the file
    public static void printAllJsonData() {
        try(var s = Files.lines(path)) {
            s.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, JSONArray> getAnimalsMap() {

        JSONParser jsonParser = new JSONParser();
        StringBuilder sb = new StringBuilder();

        try (var s = Files.lines(path)) {
            s.forEach(sb::append);

            Object fullJsonObject = jsonParser.parse(sb.toString());
            JSONArray fullArray = (JSONArray) fullJsonObject;

            fullArray.forEach(type -> createAnimalsMap((JSONObject) type));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return animals;
    }

    private static void createAnimalsMap(JSONObject obj) {
        JSONArray c = (JSONArray) obj.get("cats");
        JSONArray d = (JSONArray) obj.get("dogs");

        if (c != null) {
            animals.put("cats", c);
        } else {
            animals.put("dogs", d);
        }
    }

}
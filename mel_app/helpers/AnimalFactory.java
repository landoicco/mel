package helpers;

import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import animals.Cat;
import animals.Animal;

public class AnimalFactory {


    public static void createAnimalObjects() {
        Map<String, JSONArray> animals = JsonFileHandler.getAnimals();
        createAnimalObjects(animals);
    }

    private static void createAnimalObjects(Map<String, JSONArray> animals) {
        // Create Cat object for each cat
        animals.get("cats").forEach(c -> createCatObject((JSONObject) c));

        // Create Dog object for each dog
        animals.get("dogs").forEach(d -> createDogObject((JSONObject) d));
    }

    private static void createCatObject(JSONObject cat) {
        String name = (String) cat.get("name");
        String gender = (String) cat.get("gender");
        String birthDate = (String) cat.get("birthDate");    
        System.out.println(name);
        // System.out.println(cat);
        // Cat testCat = new Cat(name, gender, birthDate, true);

        // System.out.println((Animal) testCat);
    }

    private static void createDogObject(JSONObject dog) {
        System.out.println(dog);
    }

}
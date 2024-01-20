package lando.mel.app.helpers;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import lando.mel.app.animals.Cat;
import lando.mel.app.animals.Dog;
import lando.mel.app.animals.Animal;

public class AnimalFactory {

    private static int id = 1;

    private static Set<Cat> cats = new HashSet<>();
    private static Set<Dog> dogs = new HashSet<>();

    public static void createAnimalObjects() {
        // Map<String, JSONArray> animals = JsonFileHandler.getAnimals();
        // createAnimalObjects(animals);
    }

    public static Set<Cat> getCatsSet() {
        System.out.println("AnimalFactory.getCatsSet() method called");
        System.out.println(new Cat(0, "test", "test", "test", true));
        return cats;
    }

    public static Set<Dog> getDogsSet() {
        return dogs;
    }

    private static void createAnimalObjects(Map<String, JSONArray> animals) {

        // Create Cat object for each cat
        animals.get("cats").forEach(c -> createCatObject((JSONObject) c));

        // Create Dog object for each dog
        animals.get("dogs").forEach(d -> createDogObject((JSONObject) d));

        System.out.println(getCatsSet());
        System.out.println(getDogsSet());

        // DatabaseHandler.storeCatsDataToDatabase(getCatsSet());
        // DatabaseHandler.storeDogsDataToDatabase(getDogsSet());
    }

    private static void createCatObject(JSONObject cat) {
        String name = (String) cat.get("name");
        String gender = (String) cat.get("gender");
        String birthDate = (String) cat.get("birthDate");

        Cat testCat = new Cat(id++, name, gender, birthDate, true);

        // Add to the 'cats' set
        cats.add(testCat);
    }

    private static void createDogObject(JSONObject dog) {

        String name = (String) dog.get("name");
        String gender = (String) dog.get("gender");
        String birthDate = (String) dog.get("birthDate");

        Dog testDog = new Dog(id++, name, gender, birthDate, true);

        // Add to the 'dogs' set
        dogs.add(testDog);
    }

}
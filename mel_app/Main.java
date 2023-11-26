import helpers.JsonFileHandler;
import helpers.AnimalFactory;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Animals Management app ==");

        // Load JSON data and add in-memory
        JsonFileHandler.loadJsonData();
        AnimalFactory.createAnimalObjects();
    }
}
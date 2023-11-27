package helpers;

import java.util.Set;
import database.CatJDBC;
import database.DogJDBC;
import animals.Cat;
import animals.Dog;

public class DatabaseHandler {

    public static void storeCatsDataToDatabase(Set<Cat> cats) {

        CatJDBC catDB = new CatJDBC();

        for (Cat cat : cats) {
            catDB.insert(cat);
        }
    }

    public static void storeDogsDataToDatabase(Set<Dog> dogs) {

        DogJDBC dogDB = new DogJDBC();

        for (Dog dog : dogs) {
            dogDB.insert(dog);
        }
    }

}
package lando.mel.database.helpers;

import java.util.Set;

import lando.mel.database.jdbc.CatJDBC;
import lando.mel.database.jdbc.DogJDBC;
import lando.mel.models.animal.Cat;
import lando.mel.models.animal.Dog;

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
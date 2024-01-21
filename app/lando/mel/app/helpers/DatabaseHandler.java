package lando.mel.app.helpers;

import java.util.Set;
import lando.mel.app.database.CatJDBC;
import lando.mel.app.database.DogJDBC;
import lando.mel.app.animals.Cat;
import lando.mel.app.animals.Dog;

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
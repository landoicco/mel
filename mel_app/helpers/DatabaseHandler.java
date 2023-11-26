package helpers;

import java.util.Set;
import database.CatJDBC;
import animals.Cat;

public class DatabaseHandler {

    public static void storeCatsDataToDatabase(Set<Cat> cats) {

        CatJDBC catDB = new CatJDBC();

        for (Cat cat : cats) {
            catDB.insert(cat);
        }
    }

}
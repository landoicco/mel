import animals.*;
import database.CatJDBC;
import helpers.NewAnimal;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Animals Management app ==");
        Animal testAnimal = NewAnimal.createNewCat();
        System.out.println(testAnimal);

        new CatJDBC().insert((Cat) testAnimal);
    }
}
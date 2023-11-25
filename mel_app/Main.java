import animals.Cat;
import database.CatJDBC;
import helpers.NewAnimal;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Animals Management app ==");
        // Animal testAnimal = NewAnimal.createNewCat();
        // System.out.println(testAnimal);
        Cat testAnimal = new Cat(001, "Max", "male", "22-22-2222", true, null, 
            null, null, null, null);
        Cat testAnimal2 = new Cat(001, "Pistacha", "female", "22-22-2222", true, null, 
        null, null, null, null);

        new CatJDBC().insert((Cat) testAnimal);
        new CatJDBC().insert((Cat) testAnimal2);
    }
}
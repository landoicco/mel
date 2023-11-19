import animals.*;
import helpers.NewAnimal;

public class Main {
    public static void main(String args[]) {
        System.out.println("Webos perros!");
        Animal testAnimal = NewAnimal.createNewCat();
        System.out.println(testAnimal);
    }
}
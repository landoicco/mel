package lando.mel.app;

import lando.mel.app.database.jdbc.CatJDBC;
import lando.mel.app.database.jdbc.DogJDBC;
import lando.mel.app.models.animal.Cat;
import lando.mel.app.models.animal.Dog;

public class Main {
    public static void main(String args[]) {
        System.out.println("== MEL: Animals Management app ==");

        System.out.println(Cat.getDummyCat());
        System.out.println(Dog.getDummyDog());

        DogJDBC d = new DogJDBC();
        d.insert(Dog.getDummyDog());
        d.insert(Dog.getDummyDog());

        CatJDBC c = new CatJDBC();
        c.insert(Cat.getDummyCat());
        c.insert(Cat.getDummyCat());

    }
}
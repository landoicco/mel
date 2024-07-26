package lando.mel.app;

import lando.mel.app.database.jdbc.CatJDBC;
import lando.mel.app.database.jdbc.DogJDBC;
import lando.mel.models.animal.Cat;
import lando.mel.models.animal.Dog;

public class Main {
    public static void main(String... args) {
        System.out.println("== MEL: Animals Management app ==");

        DogJDBC d = new DogJDBC();
        d.insert(Dog.getDummyDog());
        d.insert(Dog.getDummyDog());
        d.insert(Dog.getDummyDog());
        d.insert(Dog.getDummyDog());
        d.insert(Dog.getDummyDog());

        System.out.println("Dogs inserted to Database");
        System.out.println(d.select());
        System.out.println("Total dogs in DB: " + d.select().size());

        CatJDBC c = new CatJDBC();
        c.insert(Cat.getDummyCat());
        c.insert(Cat.getDummyCat());
        c.insert(Cat.getDummyCat());

        System.out.println("Cats inserted to Database");
        System.out.println(c.select());
        System.out.println("Total cats in DB: " + c.select().size());

        // Test cat object to update
        c.update(new Cat(2, 'f', false, false, "GGGG", "", "", "", "1998-07-04", "1998-07-04"));
        System.out.println("Cat number 2 updated from DB");
        System.out.println(c.select());
        System.out.println("Total cats in DB: " + c.select().size());

        // Test dog object to update
        d.update(new Dog(3, 'f', false, false, "GGGGGGGGG DOG", "", "", "", "1998-07-04", "1998-07-04"));
        System.out.println("Dog number 3 deleted from DB");
        System.out.println(d.select());
        System.out.println("Total dogs in DB: " + d.select().size());
    }
}
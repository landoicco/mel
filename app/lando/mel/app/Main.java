package lando.mel.app;

import lando.mel.app.models.animal.Cat;
import lando.mel.app.models.animal.Dog;

public class Main {
    public static void main(String args[]) {
        System.out.println("== MEL: Animals Management app ==");

        System.out.println(Cat.getDummyCat());
        System.out.println(Dog.getDummyDog());

    }
}
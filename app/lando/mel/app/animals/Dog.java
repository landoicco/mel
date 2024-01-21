package lando.mel.app.animals;

import java.util.HashMap;

public class Dog extends Animal {

    private final String breed;

    public Dog(HashMap<String, String> data) {
        super(
                data.get("name"),
                data.get("alias"),
                data.get("gender"),
                data.get("birthDate"),
                data.get("joinerSince"),
                data.get("color"),
                true,
                true);
        this.breed = data.get("breed");

        setAnimalData(data);
    }

    public Dog() {
        super();
        this.breed = "4 legs";
    }

    public String getBreed() {
        return breed;
    }

    public String toString() {
        return super.toString();
    }
}
package lando.mel.app.animals;

import java.util.HashMap;

public class Cat extends Animal {

    public Cat(HashMap<String, String> data) {
        super(
                data.get("name"),
                data.get("alias"),
                data.get("gender"),
                data.get("birthDate"),
                data.get("joinerSince"),
                data.get("color"),
                true,
                true);

        setAnimalData(data);
    }

    public Cat() {
        super();
    }

    public String toString() {
        return super.toString();
    }
}

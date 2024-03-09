package lando.mel.app.models.animal;

import java.util.Map;

public class Dog extends Animal {

    private final String breed;
    private final String colors;

    public Dog(int id, char gender, boolean alive, String name, String alias, String breed, String colors) {
        super(id, gender, alive, name, alias);
        this.breed = breed;
        this.colors = colors;
    }

    public String getColorPattern() {
        return breed;
    }

    public String getColors() {
        return colors;
    }

    public Map<String, Object> getDataMap() {
        Map<String, Object> catData = getParentAnimalClassDataMap();
        catData.put("breed", breed);
        catData.put("colors", colors);
        return catData;
    }

    public String toString() {
        return "Dog Data -> " + getDataMap().toString();
    }

    public static Dog getDummyDog() {
        return new Dog(-1, 'f', true, "Testy test",
                "test dog", "Pitbull", "red,white");
    }
}

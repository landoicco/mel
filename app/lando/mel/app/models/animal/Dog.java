package lando.mel.app.models.animal;

import java.util.Map;

public final class Dog extends Animal {

    private final String breed;
    private final String colors;

    public Dog(int id, char gender, boolean alive, boolean canBeget, String name, String alias, String breed,
            String colors,
            String birthDate, String joinerSince) {
        super(id, gender, alive, canBeget, name, alias, birthDate, joinerSince);
        this.breed = breed;
        this.colors = colors;
    }

    public String getBreed() {
        return breed;
    }

    public String getColors() {
        return colors;
    }

    public Map<String, Object> getDataMap() {
        Map<String, Object> dogData = super.getDataMap();
        dogData.put("breed", getBreed());
        dogData.put("colors", getColors());
        return dogData;
    }

    public String toString() {
        return "Dog Data -> " + getDataMap().toString();
    }

    public static Dog getDummyDog() {
        return new Dog(-1, 'f', true, true, "Testy test",
                "test dog", "Pitbull", "red,white", "1998-07-04", "1998-07-04");
    }
}

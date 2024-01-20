package lando.mel.app.animals;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String gender, String birthDate, String joinerSince, String color,
            boolean isSterilized, boolean alive, String breed) {
        this.breed = breed;
    }

    public Dog() {
        super();
        this.breed = "4 legs";
    }

    public String toString() {
        return super.getSummary().toString();
    }
}
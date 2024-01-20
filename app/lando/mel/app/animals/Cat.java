package lando.mel.app.animals;

public class Cat extends Animal {

    public Cat(String name, String gender, String birthDate, String joinerSince, String color,
            boolean isSterilized, boolean alive) {
        super(name, gender, birthDate, joinerSince, color, isSterilized, alive);
    }

    public Cat() {
        super();
    }

    public String toString() {
        return super.getSummary().toString();
    }
}

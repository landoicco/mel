package lando.mel.app.animals;

import java.util.List;

public abstract class Animal {
    private int id;
    private String name;
    private String gender;
    private String birthDate;
    private boolean alive;

    public Animal(int id, String name, String gender, String birthDate, boolean alive) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.alive = alive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public boolean isAlive() {
        return alive;
    }

    protected List<Object> getSummary() {
        return List.of(id, name, gender, birthDate, alive);
    }

    public String toString() {
        return getSummary().toString();
    }

}

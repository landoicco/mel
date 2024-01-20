package lando.mel.app.animals;

import java.util.List;

public abstract class Animal {
    private int id_user;

    private String name;
    private String gender;
    private String birthDate;
    private String joinerSince;
    private String color;

    private boolean isSterilized;
    private boolean alive;

    public Animal(String name, String gender, String birthDate, String joinerSince, String color,
            boolean isSterilized, boolean alive) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.joinerSince = joinerSince;
        this.color = color;
        this.isSterilized = isSterilized;
        this.alive = alive;
    }

    public Animal() {
        this.name = "Test animal";
        this.gender = "male";
        this.birthDate = "00-00-0000";
        this.joinerSince = "00-00-0000";
        this.color = "yellow";
        this.isSterilized = false;
        this.alive = true;
    }

    public int getId() {
        return id_user;
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
        return List.of(id_user, name, gender, birthDate, alive);
    }

    public String toString() {
        return getSummary().toString();
    }

}

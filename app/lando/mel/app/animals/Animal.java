package lando.mel.app.animals;

import java.util.HashMap;

public abstract class Animal {
    private int id_user;

    private String name;
    private String gender;
    private String birthDate;
    private String joinerSince;
    private String color;

    private boolean isSterilized;

    private boolean alive;

    private HashMap<String, String> data;

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

    public String getJoinerSince() {
        return joinerSince;
    }

    public String getColor() {
        return color;
    }

    public boolean isSterilized() {
        return isSterilized;
    }

    public boolean isAlive() {
        return alive;
    }

    public HashMap<String, String> getAnimalData() {
        return data;
    }

    public String toString() {
        if (data == null) {
            System.out.println("Dummy object, no data on it!");
            return super.toString();
        }
        System.out.println(data.get("name") + " {");
        data.forEach((k, v) -> System.out.println(" " + k + ": " + v));
        System.out.println("}");
        return super.toString();
    }

    protected void setAnimalData(HashMap<String, String> data) {
        this.data = data;
    }
}

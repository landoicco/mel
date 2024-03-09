package lando.mel.app.models.animal;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    private final int id;
    private final char gender;
    private final boolean alive;
    private final String name, alias;
    // private final Date birthDate, joinerSince, trackingSince;

    private final Map<String, Object> data;

    protected Animal(int id, char gender, boolean alive, String name, String alias) {
        this.id = id;
        this.gender = gender;
        this.alive = alive;
        this.name = name;
        this.alias = alias;
        // this.birthDate = Date(birthDate); TODO: Add logic to parse a String to Date
        // this.joinerSince = joinerSince;
        // trackingSince Should be calculated automatically when register is created!

        // Create data object
        HashMap<String, Object> catData = new HashMap<String, Object>();
        catData.put("id", id);
        catData.put("gender", gender);
        catData.put("alive", id);
        catData.put("name", name);
        catData.put("alias", alias);
        // TODO: Add Date objects here

        this.data = catData;

    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    protected Map<String, Object> getParentAnimalClassDataMap() {
        return data;
    }

    // Force Animal objects to offers methods to describe themselves
    public abstract Map<String, Object> getDataMap();

    public abstract String toString();

}

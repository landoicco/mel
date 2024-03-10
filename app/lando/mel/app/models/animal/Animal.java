package lando.mel.app.models.animal;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    private final int id;
    private final char gender;
    private final boolean alive, canBeget;
    private final String name, alias;
    private final LocalDate birthDate, joinerSince, trackingSince;

    private final Map<String, Object> data;

    protected Animal(int id, char gender, boolean alive, boolean canBeget, String name, String alias, String birthDate,
            String joinerSince) {
        this.id = id;
        this.gender = gender;
        this.alive = alive;
        this.canBeget = canBeget;
        this.name = name;
        this.alias = alias;
        this.birthDate = localDateFromString(birthDate);
        this.joinerSince = localDateFromString(joinerSince);
        this.trackingSince = LocalDate.now();

        // Create data object
        HashMap<String, Object> animalData = new HashMap<String, Object>();
        animalData.put("id", id);
        animalData.put("gender", gender);
        animalData.put("alive", alive);
        animalData.put("canBeget", canBeget);
        animalData.put("name", name);
        animalData.put("alias", alias);
        animalData.put("birthDate", birthDate);
        animalData.put("joinerSince", joinerSince);
        animalData.put("trackingSince", trackingSince);

        this.data = animalData;

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

    public boolean canBeget() {
        return canBeget;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getJoinerSince() {
        return joinerSince;
    }

    public LocalDate getTrackingSince() {
        return trackingSince;
    }

    protected Map<String, Object> getDataMap() {
        return data;
    }

    // Utility method to create LocalDate objects
    private LocalDate localDateFromString(String str) {
        String[] arr = str.split("-");
        return LocalDate.of(
                Integer.valueOf(arr[0]), // Year
                Integer.valueOf(arr[1]), // Month
                Integer.valueOf(arr[2])); // Day
    }
}

package lando.mel.models.animal;

import java.util.Map;

public final class Cat extends Animal {

    private final String colorPattern;
    private final String colors;

    public Cat(int id, char gender, boolean alive, boolean canBeget, String name, String alias, String colorPattern,
            String colors,
            String birthDate, String joinerSince) {
        super(id, gender, alive, canBeget, name, alias, birthDate, joinerSince);
        this.colorPattern = colorPattern;
        this.colors = colors;
    }

    public String getColorPattern() {
        return colorPattern;
    }

    public String getColors() {
        return colors;
    }

    public Map<String, Object> getDataMap() {
        Map<String, Object> catData = super.getDataMap();
        catData.put("colorPattern", getColorPattern());
        catData.put("colors", getColors());
        return catData;
    }

    public String toString() {
        return "Cat Data -> " + getDataMap().toString();
    }

    public static Cat getDummyCat() {
        return new Cat(-1, 'f', true, true, "Testy test",
                "test cat", "one color", "red,white", "1998-07-04", "1998-07-04");
    }
}

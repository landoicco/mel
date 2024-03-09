package lando.mel.app.models.animal;

import java.util.Map;

public class Cat extends Animal {

    private final String colorPattern;
    private final String colors;

    public Cat(int id, char gender, boolean alive, String name, String alias, String colorPattern, String colors) {
        super(id, gender, alive, name, alias);
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
        Map<String, Object> catData = getParentAnimalClassDataMap();
        catData.put("colorPattern", colorPattern);
        catData.put("colors", colors);
        return catData;
    }

    public String toString() {
        return "Cat Data -> " + getDataMap().toString();
    }

    public static Cat getDummyCat() {
        return new Cat(-1, 'f', true, "Testy test",
                "test cat", "one color", "red,white");
    }
}

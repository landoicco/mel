package animals;

import java.util.List;
import java.util.Set;

public class Cat extends Animal {

    // private String breed;
    // private String eyeColor;
    // private Set<String> colors;
    // private Set<String> pathologies;
    // private Object vaccineRecord;

    public Cat(int id, String name, String gender, String birthDate, boolean alive) {
        super(id, name, gender, birthDate, alive);
        // this.breed = breed;
        // this.eyeColor = eyeColor;
        // this.colors = colors;
        // this.pathologies = pathologies;
        // this.vaccineRecord = vaccineRecord;
    }

    // public List<Object> getSummary() {
    //     List<Object> summary = List.of(super.getSummary(), breed, eyeColor, colors, pathologies,
    //             vaccineRecord.toString());

    //     return summary;
    // }

    public String toString() {
        return super.getSummary().toString();
    }
}

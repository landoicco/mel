package animals;

public class Dog extends Animal {
    
    public Dog(int id, String name, String gender, String birthDate, boolean alive) {
        super(id, name, gender, birthDate, alive);
    }

    public String toString() {
        return super.getSummary().toString();
    }
}
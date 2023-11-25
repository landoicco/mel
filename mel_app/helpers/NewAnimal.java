package helpers;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import animals.Animal;
import animals.Cat;

public class NewAnimal {
    public static Animal createNewCat() {
        ArrayList<Object> catData = getCatData();
        return new Cat((int) Math.random(),
                (String) catData.get(0),
                ((String) catData.get(1) == "m") ? "male" : "female",
                (String) catData.get(2),
                ((String) catData.get(3) == "y") ? true : false,
                (String) catData.get(4),
                (String) catData.get(5),
                new TreeSet<String>(Arrays.asList((String) catData.get(6))),
                new TreeSet<String>(Arrays.asList((String) catData.get(7))),
                new Object());
    }

    // Open console and ask user cat info
    private static ArrayList<Object> getCatData() {
        Console console = System.console();
        ArrayList<Object> items = new ArrayList<>();
        if (console != null) {
            console.writer().println("Enter name:");
            items.add(console.readLine());
            console.writer().println("Enter \'m\' for male and \'f\' for female:");
            items.add(console.readLine());
            console.writer().println("Enter Birth Date \'mm-dd-yyyy\':");
            items.add(console.readLine());
            console.writer().println("Is alive? Enter \'y\' for yes, \'n\' for no");
            items.add(console.readLine());
            console.writer().println("Enter the cat breed:");
            items.add(console.readLine());
            console.writer().println("Enter the cat eyes color:");
            items.add(console.readLine());
            console.writer().println("Enter the cat colors:");
            items.add(console.readLine());
            console.writer().println("Enter any pathology that the cat have");
            items.add(console.readLine());
            console.writer().println("You entered " + items);
        } else {
            System.err.println("ERROR: Console not available");
        }
        return items;
    }
}

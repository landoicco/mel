import helpers.JsonFileReader;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Animals Management app ==");

        // Tests on JsonFileReader
        System.out.println(JsonFileReader.getAnimalsMap().get("dogs"));
    }
}
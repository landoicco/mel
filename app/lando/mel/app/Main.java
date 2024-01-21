package lando.mel.app;

import java.util.HashMap;

import lando.mel.app.animals.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("== MEL: Animals Management app ==");

        // Create Cat and Dog object for testing...
        HashMap<String, String> data = new HashMap<>();
        data.put("name", "Test");
        data.put("alias", "testy");
        data.put("gender", "male");
        data.put("birthDate", "00-00-0000");
        data.put("joinerSince", "00-00-0000");
        data.put("color", "yellow");
        data.put("isSterilized", "true");
        data.put("alive", "true");
        data.put("breed", "4 legs");
        Dog dog = new Dog(data);
        System.out.println(dog);
        System.out.println(new Cat());


        // Store test Cat to database

        // try {
        // System.out.println(ConnectionHandler.getConnection());
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }
    }
}
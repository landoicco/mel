package lando.mel.app;

import java.util.HashMap;

import lando.mel.app.helpers.ServiceProvider;

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

        HashMap<String, String> data2 = new HashMap<>();
        data2.put("name", "Testyy");
        data2.put("alias", "testyy");
        data2.put("gender", "female");
        data2.put("birthDate", "00-00-0000");
        data2.put("joinerSince", "00-00-0000");
        data2.put("color", "yellow");
        data2.put("isSterilized", "true");
        data2.put("alive", "true");
        data2.put("breed", "4 legs");

        System.out.println("Service found!  --> " + ServiceProvider.findSingleCLIService());
        System.out.println("Service found!  --> " + ServiceProvider.findAllCLIServices());

    }
}
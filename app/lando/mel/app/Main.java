package lando.mel.app;

import java.sql.SQLException;

import lando.mel.app.database.ConnectionHandler;
import lando.mel.app.helpers.AnimalFactory;
// import lando.mel.app.helpers.JsonFileHandler;

public class Main {
    public static void main(String args[]) {
        System.out.println("== Animals Management app ==");

        // Load JSON data and add in-memory
        // JsonFileHandler.loadJsonData();
        AnimalFactory.getCatsSet();
        
        try {
            System.out.println(ConnectionHandler.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
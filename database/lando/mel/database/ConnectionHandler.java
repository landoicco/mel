package lando.mel.database;

import lando.mel.envreader.api.EnvironmentVariableProvider;
import lando.mel.envreader.lookup.ServiceProvider;

import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHandler {

    private static final EnvironmentVariableProvider provider = ServiceProvider.FindSingleEnvironmentVariableProvider();
    private static final Path path = Path.of(".env");

    private static final String DB_URL = provider.getVariableValue(path, "DB_URL");
    private static final String DB_USER = provider.getVariableValue(path, "DB_USER");
    private static final String DB_PASSWORD = provider.getVariableValue(path, "DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
        System.out.println(provider);
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}

package lando.mel.envreader.impl;

import lando.mel.envreader.api.EnvironmentVariableProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LocalEnvironmentVariablesProvider implements EnvironmentVariableProvider {
    @Override
    public String getVariableKey(Path path, String value) {
        // If file not reachable, return null
        if (!existsFile(path)) return null;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String currentLine;
            String[] pairs;
            while ((currentLine = reader.readLine()) != null) {
                // Support comments
                if (currentLine.contains("#")) continue;

                // Get key/value 2D array
                pairs = currentLine.split("=");
                if (value.equals(pairs[1])) return pairs[0];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getVariableValue(Path path, String key) {
        // If file not reachable, return null
        if (!existsFile(path)) return null;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String currentLine;
            String[] pairs;
            while ((currentLine = reader.readLine()) != null) {
                // Support comments
                if (currentLine.contains("#")) continue;

                // Get key/value 2D array
                pairs = currentLine.split("=");
                if (key.equals(pairs[0])) return pairs[1];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean existsFile(Path p) {
        // Print CWD for testing
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        // Check if file exists
        boolean fileExists = Files.exists(p);
        System.out.println("File exists? -> " + fileExists);

        return fileExists;
    }
}

package lando.mel.app.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import lando.mel.app.database.ConnectionHandler;
import lando.mel.app.database.dao.DogDAO;
import lando.mel.app.models.animal.Dog;

public class DogJDBC implements DogDAO {

    private static final String SQL_SELECT = "SELECT id_dog, name, gender, birthDate FROM dogs";
    private static final String SQL_INSERT = "INSERT INTO dogs (name, gender, birthDate) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE dog SET name=?, gender=?, birthDate=?";
    private static final String SQL_DELETE = "DELETE FROM dog WHERE id_dog=?";

    @Override
    public List<Dog> select() {
        return null;
    }

    @Override
    public int insert(Dog dog) {
        int rows = 0;
        try (Connection conn = ConnectionHandler.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {
            stmt.setString(1, dog.getName());
            stmt.setString(2, String.valueOf(dog.getGender()));
            stmt.setString(3, String.valueOf(dog.getBirthDate()));

            // Count of modified rows
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rows;
    }

    @Override
    public int update(Dog dog) {
        return -1;
    }

    @Override
    public int delete(Dog dog) {
        return -1;
    }

}

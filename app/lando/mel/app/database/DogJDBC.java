package lando.mel.app.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import lando.mel.app.animals.Dog;

public class DogJDBC implements DogDAO {

    private static final String SQL_SELECT = "SELECT id_user, name, gender, birthDate FROM cats";
    private static final String SQL_INSERT = "INSERT INTO dogs (name, alias, gender, birthDate, joinerSince, color, isSterilized, alive, breed) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cat SET name=?, gender=?, birthDate=?";
    private static final String SQL_DELETE = "DELETE FROM cat WHERE id_cats=?";

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
            stmt.setString(2, dog.getAlias());
            stmt.setString(3, dog.getGender());
            stmt.setString(4, dog.getBirthDate());
            stmt.setString(5, dog.getJoinerSince());
            stmt.setString(6, dog.getColor());
            stmt.setString(7, String.valueOf(dog.isSterilized()));
            stmt.setString(8, String.valueOf(dog.isAlive()));
            stmt.setString(9, dog.getBreed());

            // Count of modified rows
            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    @Override
    public int update(Dog cat) {
        return -1;
    }

    @Override
    public int delete(Dog cat) {
        return -1;
    }

}

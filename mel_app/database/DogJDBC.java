package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import animals.Dog;

public class DogJDBC implements DogDAO {

    private static final String SQL_SELECT = "SELECT id_cats, name, gender, birthDate FROM cats";
    private static final String SQL_INSERT = "INSERT INTO dogs (name, gender, birthDate) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cat SET name=?, gender=?, birthDate=?";
    private static final String SQL_DELETE = "DELETE FROM cat WHERE id_cats=?";

    @Override
    public List<Dog> select() {
        return null;
    }

    @Override
    public int insert(Dog dog) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ConnectionHandler.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, dog.getName());
            stmt.setString(2, dog.getGender());
            stmt.setString(3, dog.getBirthDate());

            // Count of modified rows
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // ConnectionHandler.close(stmt);
            // ConnectionHandler.close(conn);
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

package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import animals.Cat;

public class CatJDBC implements CatDAO {

    private static final String SQL_SELECT = "SELECT id_cats, name, gender, birthDate FROM cats";
    private static final String SQL_INSERT = "INSERT INTO cats (name, gender, birthDate) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cat SET name=?, gender=?, birthDate=?";
    private static final String SQL_DELETE = "DELETE FROM cat WHERE id_cats=?";

    @Override
    public List<Cat> select() {
        return null;
    }

    @Override
    public int insert(Cat cat) {
        int rows = 0;
        try (Connection conn = ConnectionHandler.getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {
            stmt.setString(1, cat.getName());
            stmt.setString(2, cat.getGender());
            stmt.setString(3, cat.getBirthDate());

            // Count of modified rows
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return rows;
    }

    @Override
    public int update(Cat cat) {
        return -1;
    }

    @Override
    public int delete(Cat cat) {
        return -1;
    }

}

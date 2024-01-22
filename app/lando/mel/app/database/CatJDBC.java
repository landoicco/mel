package lando.mel.app.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import lando.mel.app.animals.Cat;

public class CatJDBC implements CatDAO {

    private static final String SQL_SELECT = "SELECT id_cat, name, gender, birthDate FROM cats";
    private static final String SQL_INSERT = "INSERT INTO cats (name, alias, gender, birthDate, joinerSince, color, isSterilized, alive) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cats SET name=?, alias=?, gender=?, birthDate=?, joinerSince=?, color=?, isSterilized=?, alive=? WHERE id_cat=?";
    private static final String SQL_DELETE = "DELETE FROM cat WHERE id_cat=?";

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
            stmt.setString(2, cat.getAlias());
            stmt.setString(3, cat.getGender());
            stmt.setString(4, cat.getBirthDate());
            stmt.setString(5, cat.getJoinerSince());
            stmt.setString(6, cat.getColor());
            stmt.setString(7, String.valueOf(cat.isSterilized()));
            stmt.setString(8, String.valueOf(cat.isAlive()));

            // Count of modified rows
            rows = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rows;
    }

    @Override
    public int update(Cat cat) {
        int rows = 0;

        try (Connection conn = ConnectionHandler.getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE)) {
            stmt.setString(1, cat.getName());
            stmt.setString(2, cat.getAlias());
            stmt.setString(3, cat.getGender());
            stmt.setString(4, cat.getBirthDate());
            stmt.setString(5, cat.getJoinerSince());
            stmt.setString(6, cat.getColor());
            stmt.setString(7, String.valueOf(cat.isSterilized()));
            stmt.setString(8, String.valueOf(cat.isAlive()));
            stmt.setInt(9, cat.getId());

            // Count of modified rows
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rows;
    }

    @Override
    public int delete(Cat cat) {
        return -1;
    }

}

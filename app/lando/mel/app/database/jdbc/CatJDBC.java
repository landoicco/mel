package lando.mel.app.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import lando.mel.app.database.ConnectionHandler;
import lando.mel.app.models.animal.Cat;
import lando.mel.app.database.dao.CatDAO;

import static lando.mel.app.helpers.StringUtils.*;

public class CatJDBC implements CatDAO {

    private static final String SQL_SELECT = "SELECT id_cat, name, gender, birthDate FROM cats";
    private static final String SQL_INSERT = "INSERT INTO cats (gender, is_alive, can_beget, name, alias, color_pattern, colors, birth_date, joiner_since) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cat SET name=?, gender=?, birthDate=?";
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
            stmt.setString(1, AsString(cat.getGender()));
            stmt.setString(2, AsString(cat.isAlive()));
            stmt.setString(3, AsString(cat.canBeget()));
            stmt.setString(4, cat.getName());
            stmt.setString(5, cat.getAlias());
            stmt.setString(6, cat.getColorPattern());
            stmt.setString(7, cat.getColors());
            stmt.setString(8, AsString(cat.getBirthDate()));
            stmt.setString(9, AsString(cat.getJoinerSince()));

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

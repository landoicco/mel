package lando.mel.app.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lando.mel.app.database.ConnectionHandler;
import lando.mel.app.models.animal.Cat;
import lando.mel.app.database.dao.CatDAO;

import static lando.mel.app.helpers.StringUtils.*;

public class CatJDBC implements CatDAO {

    private static final String SQL_SELECT = "SELECT cat_id, gender, is_alive, can_beget, name, alias, color_pattern, colors, birth_date, joiner_since FROM cats";
    private static final String SQL_INSERT = "INSERT INTO cats (gender, is_alive, can_beget, name, alias, color_pattern, colors, birth_date, joiner_since) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cat SET name=?, gender=?, birthDate=?";
    private static final String SQL_DELETE = "DELETE FROM cat WHERE id_cat=?";

    @Override
    public List<Cat> select() {
        Cat cat;
        List<Cat> cats = new ArrayList<>();

        try (Connection conn = ConnectionHandler.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
             ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {
                int dogId = rs.getInt("cat_id");
                String gender = rs.getString("gender");
                boolean isAlive = rs.getBoolean("is_alive");
                boolean canBeget = rs.getBoolean("can_beget");
                String name = rs.getString("name");
                String alias = rs.getString("alias");
                String breed = rs.getString("color_pattern");
                String colors = rs.getString("colors");
                String birthDate = rs.getString("birth_date");
                String joinerSince = rs.getString("joiner_since");

                cat = new Cat(dogId, gender.charAt(0), isAlive, canBeget, name,
                        alias, breed, colors, birthDate, joinerSince);

                cats.add(cat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cats;
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

package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import animals.Cat;

public class CatJDBC implements CatDAO {

    private static final String SQL_SELECT = "SELECT id_cats, name, gender, birthDate FROM cats";
    private static final String SQL_INSERT = "INSERT INTO cats (name, gender, birthDate) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cat SET name=?, gender=?, birthDate=?";
    private static final String SQL_DELETE = "DELETE FROM cat WHERE id_cats=?";

    @Override
    public List<Cat> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cat cat;
        List<Cat> cats = new ArrayList<>();

        try {
            conn = ConnectionHandler.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id_cats = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String birthDate = rs.getString("birthDate");

                cat = new Cat(id_cats, name, gender, birthDate, true, null, null, null, null, null);

                cats.add(cat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insert(Cat cat) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ConnectionHandler.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cat.getName());
            stmt.setString(2, cat.getGender());
            stmt.setString(3, cat.getBirthDate());

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
    public int update(Cat cat) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = ConnectionHandler.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cat.getName());
            stmt.setString(2, cat.getGender());
            stmt.setString(3, cat.getBirthDate());

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
    public int delete(Cat cat) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = ConnectionHandler.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cat.getId());

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

}

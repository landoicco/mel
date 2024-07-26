package lando.mel.database.jdbc;

import static lando.mel.database.helpers.StringUtils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lando.mel.database.ConnectionHandler;
import lando.mel.database.dao.DogDAO;
import lando.mel.models.animal.Dog;

public class DogJDBC implements DogDAO {

    private static final String SQL_SELECT = "SELECT dog_id, gender, is_alive, can_beget, name, alias, breed, colors, birth_date, joiner_since FROM dogs";
    private static final String SQL_INSERT = "INSERT INTO dogs (gender, is_alive, can_beget, name, alias, breed, colors, birth_date, joiner_since) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE dogs SET gender=?, is_alive=?, can_beget=?, name=?, alias=?, breed=?, colors=?, birth_date=?, joiner_since=? WHERE dog_id=?";
    private static final String SQL_DELETE = "DELETE FROM dogs WHERE dog_id=?";

    @Override
    public List<Dog> select() {
        Dog dog;
        List<Dog> dogs = new ArrayList<>();

        try (Connection conn = ConnectionHandler.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
             ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {
                int dogId = rs.getInt("dog_id");
                String gender = rs.getString("gender");
                boolean isAlive = rs.getBoolean("is_alive");
                boolean canBeget = rs.getBoolean("can_beget");
                String name = rs.getString("name");
                String alias = rs.getString("alias");
                String breed = rs.getString("breed");
                String colors = rs.getString("colors");
                String birthDate = rs.getString("birth_date");
                String joinerSince = rs.getString("joiner_since");

                dog = new Dog(dogId, gender.charAt(0), isAlive, canBeget, name,
                        alias, breed, colors, birthDate, joinerSince);

                dogs.add(dog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dogs;
    }

    @Override
    public int insert(Dog dog) {
        int rows = 0;
        try (Connection conn = ConnectionHandler.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {
            stmt.setString(1, AsString(dog.getGender()));
            stmt.setString(2, AsString(dog.isAlive()));
            stmt.setString(3, AsString(dog.canBeget()));
            stmt.setString(4, dog.getName());
            stmt.setString(5, dog.getAlias());
            stmt.setString(6, dog.getBreed());
            stmt.setString(7, dog.getColors());
            stmt.setString(8, AsString(dog.getBirthDate()));
            stmt.setString(9, AsString(dog.getJoinerSince()));

            // Count of modified rows
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rows;
    }

    @Override
    public int update(Dog dog) {
        int rows = 0;
        try (Connection conn = ConnectionHandler.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE)) {
            stmt.setString(1, AsString(dog.getGender()));
            stmt.setString(2, AsString(dog.isAlive()));
            stmt.setString(3, AsString(dog.canBeget()));
            stmt.setString(4, dog.getName());
            stmt.setString(5, dog.getAlias());
            stmt.setString(6, dog.getBreed());
            stmt.setString(7, dog.getColors());
            stmt.setString(8, AsString(dog.getBirthDate()));
            stmt.setString(9, AsString(dog.getJoinerSince()));

            stmt.setInt(10, dog.getId());

            // Count of modified rows
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rows;
    }

    @Override
    public int delete(int id) {
        int rows = 0;
        try (Connection conn = ConnectionHandler.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_DELETE)) {

            stmt.setInt(1, id);

            // Count of modified rows
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

}

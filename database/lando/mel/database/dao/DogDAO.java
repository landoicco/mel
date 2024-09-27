package lando.mel.database.dao;

import java.util.List;

import lando.mel.models.animal.Dog;

public interface DogDAO {

    List<Dog> select();

    int insert(Dog dog);

    int update(Dog dog);

    int delete(int id);

}

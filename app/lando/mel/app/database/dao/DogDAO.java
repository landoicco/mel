package lando.mel.app.database.dao;

import java.util.List;

import lando.mel.app.models.animal.Dog;

public interface DogDAO {

    List<Dog> select();

    int insert(Dog dog);

    int update(Dog dog);

    int delete(Dog dog);

}

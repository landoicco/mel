package lando.mel.app.database;

import java.util.List;

import lando.mel.app.animals.Dog;

public interface DogDAO {

    List<Dog> select();

    int insert(Dog dog);

    int update(Dog dog);

    int delete(Dog dog);

}

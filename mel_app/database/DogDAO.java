package database;

import java.util.List;

import animals.Dog;

public interface DogDAO {

    List<Dog> select();

    int insert(Dog dog);

    int update(Dog dog);

    int delete(Dog dog);

}

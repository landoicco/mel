package lando.mel.database.dao;

import java.util.List;

import lando.mel.models.animal.Cat;

public interface CatDAO {

    List<Cat> select();

    int insert(Cat cat);

    int update(Cat cat);

    int delete(int id);

}

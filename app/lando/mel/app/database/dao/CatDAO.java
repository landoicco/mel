package lando.mel.app.database.dao;

import java.util.List;

import lando.mel.app.models.animal.Cat;

public interface CatDAO {

    List<Cat> select();

    int insert(Cat cat);

    int update(Cat cat);

    int delete(Cat cat);

}

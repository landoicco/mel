package lando.mel.app.database;

import java.util.List;

import lando.mel.app.animals.Cat;

public interface CatDAO {

    List<Cat> select();

    int insert(Cat cat);

    int update(Cat cat);

    int delete(Cat cat);

}

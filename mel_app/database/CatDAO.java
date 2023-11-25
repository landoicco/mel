package database;

import java.util.List;

import animals.Cat;

public interface CatDAO {

    List<Cat> select();

    int insert(Cat user);

    int update(Cat user);

    int delete(Cat user);

}

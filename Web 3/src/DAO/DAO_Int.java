package DAO;

import com.Game_Product.One_Unit;

import java.util.List;
import java.util.function.Consumer;

public interface DAO_Int {

    List<One_Unit> getAll();

    One_Unit getById (long id);

    One_Unit create (double price, String name, String annotation, String details);

    boolean delete(long id);

    void update(One_Unit gameUnit);

}

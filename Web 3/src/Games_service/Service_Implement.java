package Games_service;

import DAO.DAO_Int;
import com.Game_Product.One_Unit;

import java.util.List;

public class Service_Implement implements Service {

private final DAO_Int DAO;

    public Service_Implement(DAO_Int DAO)
    {
        this.DAO = DAO;
    }

    @Override
    public List<One_Unit> getAll() {
        //

        return DAO.getAll();
    }

    @Override
    public One_Unit getById(long id) {
        //

        return DAO.getById(id);
    }

    @Override
    public One_Unit create(double price, String name, String annotation, String details) {
        //

        return DAO.create(price, name, annotation, details);
    }

    @Override
    public boolean delete(long id) {
        return DAO.delete(id);
    }

    @Override
    public void update(One_Unit gameUnit) {
DAO.update(gameUnit);
    }
}

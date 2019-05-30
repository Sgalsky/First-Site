package DAO;

import com.Game_Product.One_Unit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public enum DAO_Options implements DAO_Int{
    INSTANCE;

    private AtomicLong idGen = new AtomicLong();
    private Map<Long, One_Unit> allGames = new HashMap<>();


    @Override
    public List<One_Unit> getAll() {
        return new ArrayList<>(allGames.values());
    }

    @Override
    public One_Unit getById(long id) {
        return allGames.get(id);
    }

    @Override
    public One_Unit create(double price, String name, String annotation, String details) {
        One_Unit gameUnit = new One_Unit(idGen.incrementAndGet(), price, name, annotation, details);
        allGames.put(gameUnit.getId(), gameUnit);
        return gameUnit;
    }

    @Override
    public boolean delete(long id) {
        One_Unit remove = allGames.remove(id);
        return remove != null;
}

    @Override
    public void update(One_Unit gameUnit) {
        allGames.put(gameUnit.getId(), gameUnit);
    }
}

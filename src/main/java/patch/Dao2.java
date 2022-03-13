package patch;

import dao.IDao;

public class Dao2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur");
        return Math.random()*80;

    }
}

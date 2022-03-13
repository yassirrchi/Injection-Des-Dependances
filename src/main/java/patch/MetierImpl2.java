package patch;

import dao.IDao;
import metier.IMetier;

public class MetierImpl2 implements IMetier {
    private IDao dao;

    @Override
    public double calcule() {
        System.out.println("version capteur");
        double tmp=dao.getData();
        double res=tmp*54839/64;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

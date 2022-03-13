package metier;

import dao.Dao;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;
    public MetierImpl(IDao dao){
    this.dao=dao;
    }

    @Override
    public double calcule() {
        System.out.println("version bd");
        double tmp=dao.getData();
        double res=tmp*540/3;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

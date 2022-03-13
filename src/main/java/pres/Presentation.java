package pres;

import dao.*;
import metier.*;

public class Presentation {
    public static void main(String[] args) {
      IDao dao=new Dao();
        MetierImpl Metier=new MetierImpl(dao);
        Metier.setDao(dao);
       System.out.println(Metier.calcule());


    }
}

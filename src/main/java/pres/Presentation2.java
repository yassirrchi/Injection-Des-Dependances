package pres;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.io.File;
import dao.IDao;
import metier.IMetier;
public class Presentation2 {
    public static void main(String[] args)throws Exception {
       // IDao daostatic=new Dao()
        Scanner scanner = new Scanner(new File("src/config.txt"));
        String daoClassName=scanner.nextLine();//savoir ou choisir le nom de la classe
        Class cDao=Class.forName(daoClassName);//la charger dans la memoire
        IDao dao =(IDao) cDao.newInstance();//la instancier dynamiquement
        System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println(metier.calcule());


    }
}

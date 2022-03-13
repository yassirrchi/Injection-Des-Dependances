package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class Dao implements IDao{
    @Override
    public double getData() {
        System.out.println("version bd");
        return Math.random()*40;

    }
}

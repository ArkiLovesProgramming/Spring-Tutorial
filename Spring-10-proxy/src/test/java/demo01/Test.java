package demo01;

import com.arki.proxy.demo01.Landlord;
import com.arki.proxy.demo01.Proxy;
import com.arki.proxy.demo01.Rent;

public class Test {
    //正常调用程序
    @org.junit.Test
    public void test(){
        //我想要租房，我要实例化实现了租房类的房东类
        Rent rent = new Landlord();
        rent.rentHouse();
    }

    //采用静态代理类
    @org.junit.Test
    public void test2(){
        Rent rent = new Landlord();
        //实例化代理类
        Proxy proxy = new Proxy(rent);
        proxy.rentHouse();
    }
}

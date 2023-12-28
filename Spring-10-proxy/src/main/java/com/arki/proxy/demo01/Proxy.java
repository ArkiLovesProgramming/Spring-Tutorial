package com.arki.proxy.demo01;

//简单认识静态代理
//中介：也就是我们的代理类, 代理类要代理接口，但是要传入实现类，这里用接口只是想增强语义理解性。
//也就是，"中介代理的是租房这个行为"
public class Proxy implements Rent{
    private Rent rent;

    public Proxy(Rent rent) {
        this.rent = rent;
    }

    @Override
    public void rentHouse() {
        showHouse();
        rent.rentHouse();
        charge();
    }

    public void showHouse(){
        System.out.println("Exhibit houses!");
    }

    public void charge(){
        System.out.println("agent is charging!");
    }
}

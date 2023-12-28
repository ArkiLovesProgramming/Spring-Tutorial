package com.arki.proxy.demo01;

public class Landlord implements Rent{
    @Override
    public void rentHouse(){
        System.out.println("房东要出租房子了！");
    }
}

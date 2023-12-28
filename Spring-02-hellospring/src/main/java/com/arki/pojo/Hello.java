package com.arki.pojo;


//该模块用来测试hello spring案例1
public class Hello {
    private String str;

    public String getStr(){
        return this.str;
    }

    // spring是通过set来实现注入的
    public void setStr(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello " + this.str;
    }
}

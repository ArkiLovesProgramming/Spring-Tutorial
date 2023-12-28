package com.arki.pojo;

//测试一下spring创建对象的方式
public class User {
    private int id;
    private String name;

    public User(){
        System.out.println("无参构造初始化");
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("有参构造初始化");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("setId");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

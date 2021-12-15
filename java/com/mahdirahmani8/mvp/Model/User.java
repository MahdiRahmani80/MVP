package com.mahdirahmani8.mvp.Model;


/*
    this is user class 
    User have name,pass,age and id
    
*/



public class User {

    private String name,password,id;
    private int age;

    public User(String name, String password, String id, int age) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

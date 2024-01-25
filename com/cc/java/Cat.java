package com.cc.java;

public class Cat {

    private String name;
    private String furcolor;
    private int age;

    public Cat(String name, String furColor, int age){
        this.name = name;
        this.furcolor = furColor;
        this.age = age;

    }

    public String getName() {
        if (getPermission()) {
        return name;    
        } else {
        return "Sorry, no permission";    
        }
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurcolor() {
        return furcolor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean getPermission(){
        return true;


    }

}

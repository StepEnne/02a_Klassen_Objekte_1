package com.cc.java;

public class Cat {

  

    String name;
    String furcolor;
    int age;

    

    public Cat(String name, String furcolor, int age) {
        this.name = name;
        this.furcolor = furcolor;
        this.age = age;
    }

    public String tellYourName(){
        return this.name;
    }

    public String tellYourFur(){
        return this.furcolor;
    }

    public int tellYourAge(){
        return this.age;
    }


        public void tellYourAdress(){
            System.out.println(this);

        }
}

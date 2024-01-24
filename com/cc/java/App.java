package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    //Objekt entsteht
    Cat cat = new Cat();        //Instanziierung, erzeuge aus einer klasse ein objekt
    //Wertzuweisung
    cat.name = "Alonzo";
    cat.furcolor = "grey";
    cat.age = 35;
    
//    cat.tellYourAdress();
    //    cat.tellYourName();   
    System.out.println(cat.name);
    System.out.println(cat.furcolor);
    System.out.println(cat.age);

    System.out.println("----------------------------");

    Cat cat2 = new Cat();

    cat2.name = "Grizabella";
    cat2.furcolor = "white";
    cat2.age = 29;
    
    System.out.println(cat2.name);
    System.out.println(cat2.furcolor);
    System.out.println(cat2.age);
    }

//    cat.tellYourName();      
      Cat cat2 = new Cat();
//    System.out.println(cat2);
//    cat2.tellYourAdress();
  

}


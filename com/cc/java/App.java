package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    //Objekt entsteht
    Cat cat = new Cat();        //Instanziierung, erzeuge aus einer klasse ein objekt
    //Wertzuweisung
    cat.name = "Alonzo";
    cat.furcolor = "grey";
    cat.age = 35;
    
    // Ausgabe
   
    System.out.println(cat.tellYourName());
    System.out.println(cat.tellYourFur());
    System.out.println(cat.tellYourAge());

    System.out.println("----------------------------");

    Cat cat2 = new Cat();

    cat2.name = "Grizabella";
    cat2.furcolor = "white";
    cat2.age = 29;
    
    System.out.println(cat2.tellYourName());
    System.out.println(cat2.tellYourFur());
    System.out.println(cat2.tellYourAge());
    }

//    cat.tellYourName();      
      Cat cat2 = new Cat();
//    System.out.println(cat2);
//    cat2.tellYourAdress();
  

}


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
   
//    System.out.println(cat.tellYourName());
//    System.out.println(cat.tellYourFur());
//    System.out.println(cat.tellYourAge());
    
    output(cat.tellYourName());
    output(cat.tellYourFur());
    output(String.valueOf(cat.tellYourAge())); //int -->string

        
    System.out.println("----------------------------");

    Cat cat2 = new Cat();

    cat2.name = "Grizabella";
    cat2.furcolor = "white";
    cat2.age = 29;

    output(cat2.tellYourName());
    output(cat2.tellYourFur());
    output(Integer.toString(cat2.tellYourAge()));
    
//    System.out.println(cat2.tellYourName());
//    System.out.println(cat2.tellYourFur());
//    System.out.println(cat2.tellYourAge());
    }

    public static void output(String outputStr){
        System.out.println(outputStr);

    }

}


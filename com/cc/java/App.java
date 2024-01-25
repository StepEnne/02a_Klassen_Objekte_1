package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    //Objekt entsteht
    Cat cat = new Cat("Alonzo", "grey", 35);        //Instanziierung, erzeuge aus einer klasse ein objekt
    //Wertzuweisung
    
    // Ausgabe
   
//    System.out.println(cat.tellYourName());
//    System.out.println(cat.tellYourFur());
//    System.out.println(cat.tellYourAge());
    
    output(cat.tellYourName());
    output(cat.tellYourFur());
    output(String.valueOf(cat.tellYourAge())); //int -->string

        
    System.out.println("----------------------------");

    Cat cat2 = new Cat("Grizabella", "white", 29);

    output(cat2.tellYourName());
    output(cat2.tellYourFur());
    output(Integer.toString(cat2.tellYourAge()));  //geht auch
    
//    System.out.println(cat2.tellYourName());
//    System.out.println(cat2.tellYourFur());
//    System.out.println(cat2.tellYourAge());
    }

    public static void output(String outputStr){
        System.out.println(outputStr);

    }

}


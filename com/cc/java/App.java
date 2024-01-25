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
    
    output(cat.getName());
    output(cat.getFurcolor());
    output(String.valueOf(cat.getAge())); //int -->string

        
    System.out.println("----------------------------");

    Cat cat2 = new Cat("Grizabella", "white", 29);

    output(cat2.getName());
    output(cat2.getFurcolor());
    output(Integer.toString(cat2.getAge()));  //geht auch
    
//    System.out.println(cat2.tellYourName());
//    System.out.println(cat2.tellYourFur());
//    System.out.println(cat2.tellYourAge());
    }

    public static void output(String outputStr){
        System.out.println(outputStr);

    }

}


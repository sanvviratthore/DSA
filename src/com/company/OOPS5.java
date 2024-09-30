package com.company;

public class OOPS5 {
    public static void main(String[] args) {
//       Horse h=new Horse();
//       h.eat();
//       h.walk();
//       //h.changeColor();
//        System.out.println(h.color);// returns by default value of color in superclass Animal

//       Chicken c=new Chicken();
//       c.eat();
//       c.walk();

        Mustang myHorse = new Mustang();
        // Animal --> Horse --> Mustang
    }
}

abstract class Animal2{
    String color;
    Animal2(){
        color="brown";
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal2{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal2{
    void changeColor(){
        color="White";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

package com.company;

public class OOPS3 {
    public static void main(String[] args) {
//        Fish shark=new Fish();
//        shark.eat();

//        Dog dobby=new Dog();
//        dobby.eat();
//        dobby.legs=4;
//        System.out.println(dobby.legs);

    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats!");
    }

    void breathe(){
        System.out.println("Breathes!");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walks!");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims!");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flies!");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Barks!");
    }
}

class Cat extends Mammal{
    void purr(){
        System.out.println("Purrs!");
    }
}

class Human extends Mammal{
    void talk(){
        System.out.println("Talks!");
    }
}

class Tuna extends Fish{
    int size;
}

class Shark extends Fish{
    int teeth;
}

class Peacock extends Bird{
    int featherLength;
}

//class Mammal extends Animal{
//    int legs;
//}

//class Dog extends Mammal{
//    String breed;
//}

//class Fish extends Animal{
//    int fins;
//
//    void swim(){
//        System.out.println("Swims in Water");
//    }
//}

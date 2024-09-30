package com.company;

public class OOPS8 {
    public static void main(String[] args) {
        // object creation of the outer class
        Animal5 animal = new Animal5();

        // object creation of the non-static class
        Animal5.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        Animal5.Mammal mammal = new Animal5.Mammal();
        mammal.displayInfo();

    }
}

class Animal5 {

    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }
}


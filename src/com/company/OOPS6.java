package com.company;

public class OOPS6 {
    public static void main(String[] args) {
        Queen q= new Queen();
        q.moves();

//        Bear Masha=new Bear();
//        Masha.eat();
    }
}


interface Herbivore{
    void eat(); // by default this is abstract
}

interface  Carnivore{
    void eat();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Eats both fruits and fish");
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left ,diagonal (in all 4 directions)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, right, left ,diagonal (by 1 step at a time)");
    }
}

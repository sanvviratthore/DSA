package com.company;

public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen(); // we've created an object p1 of class Pen
       // p1.setColor("Blue");
//        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        Bankaccount myAcc= new Bankaccount();
        myAcc.username="Sanvii";
        myAcc.setPassword("abcdeif");
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String color){
        this.color=color;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}



class Bankaccount{
    public String username;
    private String password;

    void setPassword(String pwd){
        password=pwd;
    }
}
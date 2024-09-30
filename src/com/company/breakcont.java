package com.company;

public class breakcont {
    public static void main(String[] args) {
        // Using break and continue in loops
       /* for(int i=0; i<=5; i++){
            System.out.println(i);
            System.out.println("Java is great!");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }*/

       /* int i=0;
        while(i<5){
            System.out.println(i);
            System.out.println("Java is great!");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("Loop ends here");*/
       /* for(int i=0; i<=5; i++){
            if(i==2){
                System.out.println("Ending the loop"); //skips this particular iteration and moves on
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great!");
        }*/
        int i=0;
        while(i<5){
            i++;
            System.out.println(i);
            System.out.println("Java is great!");
            if(i==2) {
                System.out.println("Ending the loop");
                continue;
            }
        }
    }
}

package com.company;
//import java.util.*;

public class Arrays {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i< numbers.length; i++){
//            if(largest<numbers[i]){
//                largest = numbers[i];
//            }
//            if(smallest>numbers[i]){
//                smallest=numbers[i];
//            }

            largest=Math.max(largest,numbers[i]);
            smallest=Math.min(smallest,numbers[i]);
        }

        System.out.println("Smallest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {

//        int marks[] = new int[50];
//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Length of Array: "+ marks.length);
//        marks[0] = sc.nextInt();
//        marks[1]=sc.nextInt();
//        marks[2]= sc.nextInt();
//
//        System.out.println("physics: "+marks[0]);
//        System.out.println("Chemistry: "+marks[1]);
//        System.out.println("Math: "+marks[2]);
//
//        //marks[2]=100; //updation of marks
//        //marks[2]=marks[2]+1;
//        //System.out.println("Math: "+marks[2]);
//
//        int perc= (marks[0]+marks[1]+marks[2])/3;
//        System.out.println("Percentage: "+perc+"%");

        int numbers[]={2,4,5,6,3};

        //int num[]=;
        System.out.println("Largest number in the array is: "+getLargest(numbers));
        //System.out.println(num);
    }
}

package com.company;

public class Arrays2 {

//    public static void update(int marks[]){
//        for(int i=0; i<marks.length; i++){
//            marks[i]= marks[i]+1;
//        }
//    }
//    public static void main(String[] args) {
//        int marks[]={78,67,68};
//        update(marks);
//
//        // print our marks
//        for(int i=0; i<marks.length; i++){
//            System.out.print(marks[i]+" ");
//        }
//        System.out.println();
//    }

    public static void reverse(int num[]){
        for(int i= num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int lS(String fruits[],String key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};

//        int numbers[]={2,4,6,8,10,14};
//        //int key=10;
//
//        int index= linearSearch(numbers,key);
//        if(index == -1){
//            System.out.println("Key not found");
//        }else {
//            System.out.println("Key at index: "+index);
//        }

//        String fruits[]={"Mango","Apple","Litchi","Banana"};
//        String key="Papaya";
//
//        int index = lS(fruits,key);
//        if(index==-1){
//            System.out.println("Key not found");
//        }else{
//            System.out.println("Key found at index: "+index);
//        }

        reverse(numbers);
}
}

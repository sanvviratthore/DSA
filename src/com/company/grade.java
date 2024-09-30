package com.company;

public class grade {
    public static void main(String[] args) {
        //Encrpting
        char grade='B';
        grade=(char)(grade+8); //typecasting int to character
        System.out.println("Grade after encryption: "+ grade);

        //Decrypting
        grade=(char)(grade-8);
        System.out.println("Grade after decryption: "+ grade);

    }
}

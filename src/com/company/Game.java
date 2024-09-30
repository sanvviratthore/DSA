package com.company;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Press 1 for rock, 2 for paper, 3 for scissor, or 0 to quit:");
            int a = sc.nextInt();

            if (a == 0) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
                break;
            }

            switch (a) {
                case 1:
                    System.out.println("You've chosen rock, now it's Computer's turn");
                    break;
                case 2:
                    System.out.println("You've chosen paper, now it's Computer's turn");
                    break;
                case 3:
                    System.out.println("You've chosen scissor, now it's Computer's turn");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }

            int d = r.nextInt(1, 4);
            switch (d) {
                case 1:
                    System.out.println("Computer has chosen rock");
                    break;
                case 2:
                    System.out.println("Computer has chosen paper");
                    break;
                case 3:
                    System.out.println("Computer has chosen scissor");
                    break;
            }

            if (a == d) {
                System.out.println("Match draws");
            } else if (a == 1 && d == 3 || a == 2 && d == 1 || a == 3 && d == 2) {
                System.out.println("You've won the match");
            } else {
                System.out.println("Computer has won the match");
            }
        }
    }
}


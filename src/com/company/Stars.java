package com.company;

public class Stars {
    public static void main(String[] args) {
        /*for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

         */

         /*int n=8;
         for(int line=1; line<=n; line++){
             for(int star=1; star<=(n-line+1); star++){
                 System.out.print("*");
             }
             System.out.println();
         }

          */

        // half pyramid pattern
        /*for(int line=1; line<=4; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }

         */

        /*int n=7;
        char ch='A';

        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

         */

        // inverted number half pyramid

        /*int n=5;
        for(int line=1; line<=n; line++){
            for(int num=1; num<=(n-line+1); num++){
                System.out.print(num);
            }
            System.out.println();
        }

         */


        //floyd's triangle
        int n=5;
        int number=1;

        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(" "+number);
                number++;
            }
            System.out.println();
        }
    }
}

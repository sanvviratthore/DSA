package com.company;

import javax.xml.stream.events.Characters;

public class Assignment11 {

    final static char[][] L={{} ,{} ,{'a','b','c'}, {'d','e','f'} ,{'g','h','i'} ,{'j','k','l'}, {'m','n','o'}, {'p','q','r','s'} , {'t','u','v'}, {'w','x','y','z'}};
    public static void letterCombinations(String D){
        int len=D.length();
        if(len==0){
            System.out.println("");
            return;
        }
        bfs(D,0,len,new StringBuilder());
    }

    public static void bfs(String D, int pos, int len, StringBuilder sb){
        if(pos==len){
            System.out.println(sb.toString());
        } else{
            char[] letters=L[Character.getNumericValue(D.charAt(pos))];
            for(int i=0; i< letters.length; i++){
                bfs(D,pos+1,len,new StringBuilder(sb).append(letters[i]));
            }
        }
    }
    public static void main(String[] args) {
        letterCombinations("2");
    }
}

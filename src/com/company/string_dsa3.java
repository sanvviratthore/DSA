package com.company;

public class string_dsa3 {


    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

//    public static String compress(String str){
//        String newStr="";
//
//        for(int i=0; i<str.length(); i++){ //aaaa
//            Integer count=1;
//            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                count++;
//                i++;
//            }
//            newStr += str.charAt(i);
//            if(count > 1){
//                newStr += count.toString();
//            }
//        }
//        return newStr;
//    }

    public static String compress(String str){
        StringBuilder sb= new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        String fruits[]={"Apple","Banana","Mango","Orange"};
//
//        String smallest=fruits[0];
//        for(int i=1; i<fruits.length; i++){
//            if(smallest.compareTo(fruits[i])>0){
//                smallest=fruits[i];
//            }
//        }
//        System.out.println(smallest);

//        StringBuilder sb=new StringBuilder("");
//        for(char ch='a'; ch<='z'; ch++){
//            sb.append(ch); // O(26)
//        }
//        // if we used += then O(n^2)
//        System.out.print(sb.length());

//

       String str="aaabbb";
       System.out.println(compress(str));
    }
}

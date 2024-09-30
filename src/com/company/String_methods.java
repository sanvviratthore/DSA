package com.company;

public class String_methods {
    public static void main(String[] args) {
        String name="Sanvi";
        //String a1=new String("Sanvi");
        //System.out.println(name);
        //int len=name.length();
        //System.out.println(len);
        //String lstring=name.toLowerCase();
        //System.out.println(lstring);
        //String ustring=name.toUpperCase();
        //System.out.println(ustring);
        String nonTrimmedString="   Sanvi    ";
        //System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(2));
        //System.out.println(name.substring(1,4));
        //System.out.println(name.replace('a','b'));
        //System.out.println(name.replace("an","fu"));
        //System.out.println(name.startsWith("S"));
        //System.out.println(name.endsWith("Sa"));
        /*System.out.println(name.charAt(2));
        System.out.println(name.indexOf("v",3));
        String name2="Harry";
        System.out.println(name2.lastIndexOf("ry"));
        System.out.println(name2.lastIndexOf("rry",4));
        System.out.println(name.equals("Sanvi"));
        System.out.println(name.equalsIgnoreCase("sANVI"));
        System.out.println("I am an escape sequence \tdouble quote");*/
    }
}

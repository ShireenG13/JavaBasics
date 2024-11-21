package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class TestStringComparison {
    public static void main (String [] args){
        //authentication - equals() method
        //sorting - compareTo() method
        //reference matching  == operator
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = new String("PerScholas");
        String s4 = "Teksystem";
        String s5 = "PerSchola";
        String s6 = "PerScholasX";

        //equals method compares values of string for equality, returns boolean
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));//false

        // == operator compares references, not values. Returns boolean
        System.out.println( s1 == s2); //true ( s1 and s2 are stored in pool. refer to same location in pool )
        System.out.println( s1 == s3); //false (s3 is an object so it's stored in heap)

        //compareTo method compares values lexicographically. Returns integer. 0 if same, <0 smaller, >0 if bigger
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s6));


    }
}

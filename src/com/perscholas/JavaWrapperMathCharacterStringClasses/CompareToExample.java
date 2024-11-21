package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class CompareToExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        //0 beacuse the two strings are equal.
        System.out.println((s1.compareTo(s2)));
        //-1 beacause the first string is smaller because l is lower than m
        System.out.println((s1.compareTo(s3)));
        //2 because h is 2 times greater than f
        System.out.println(((s1.compareTo(s4))));

    }
}

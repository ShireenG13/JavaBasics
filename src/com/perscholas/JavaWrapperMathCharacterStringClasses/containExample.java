package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class containExample {
    public static void main(String [] args){
        String str1 = "Learn Java";
        //check if str1 contains "Java"
        System.out.println(str1.contains("Java"));
        //check if str1 contains Python
        System.out.println(str1.contains("Python"));
        //check if str1 contains ""
        System.out.println(str1.contains("")); //true
    }
}

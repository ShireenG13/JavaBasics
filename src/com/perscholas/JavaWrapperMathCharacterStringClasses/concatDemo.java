package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class concatDemo {
    public static void main(String[] args) {
        // Using the concat method
        String str1 = "Learn ";
        String str2 = "Java ";
        //concat str1 and str2
        System.out.println(str1.concat(str2));//Output "Learn Java"
        //concat str2 and str1
        System.out.println(str2.concat(str1));//"Java Learn"
        //Using + Operator
        String s3 = "hello ";
        String s4 = "learners";
        //String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        System.out.println(s5);
        //both methods produce the same result
        //concat 3 strings
        String message = "Welcome " + "to " + "Java ";
        System.out.println(message);
        //concat string with number
        String s = "chapter " + 2;
        System.out.println(s);
        //concat string with char
        String sch = "Supplement " + 'B';
        System.out.println(sch);
    }
}

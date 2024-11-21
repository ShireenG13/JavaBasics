package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class substringDemo {
    public static void main (String [] args){
        String str1 = "java is fun";
        //extract substring from index 0 to 3 (not including 3)
        System.out.println(str1.substring(0,3));//output jav
        //indexOf()
        //getting index of character 's'
        int result ;
        result = str1.indexOf('s');
        System.out.println(result);
        // getting indexOf character j
        int result2 = str1.lastIndexOf('j');
        System.out.println(result2);
        //index of last occurecnce of a
        System.out.println(str1.lastIndexOf('a'));
        //character not in the string
        System.out.println(str1.indexOf('J'));//output -1
        //getting the last occurence of ava
        System.out.println(str1.lastIndexOf("ava")); //1
        //substring not in the string
        System.out.println(str1.indexOf("Java")); //-1
    }
}

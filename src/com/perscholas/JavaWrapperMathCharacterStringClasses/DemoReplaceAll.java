package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class DemoReplaceAll {
    public static void main(String[] args){
        //replaces each substring that matches the regex of the string with the specified text
        String str1 = "Java123is456fun";
        //regex for sequence of digits
        String regex = "\\d+"; //regular expression that matches one or more digits
        //replace all occurences of numeric digits by a space
        System.out.println(str1.replaceAll(regex, " "));
    }
}

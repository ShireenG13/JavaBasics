package com.perscholas.JavaWrapperMathCharacterStringClasses;

public class ReplaceDemoMain {
    public static void main(String [] args){
        String str1 = "abc cba";
        //replace all occurences of 'a' with 'z'
        System.out.println(str1.replace('a', 'z')); //zbc cbz
        //replace all occurences of 'L' with 'J'
        System.out.println("Lava".replace('L', 'J')); // Java
        //character not in the string
        System.out.println("Hello".replace('4', 'j')); //Hello
        //all occurences of 'aa' replaced with 'zz'
        System.out.println("aa bb aa zz".replaceAll("aa", "zz")); //zz bb zz zz
        //substring not in the string
        System.out.println("java".replace("c++", "c")); //java

    }
}

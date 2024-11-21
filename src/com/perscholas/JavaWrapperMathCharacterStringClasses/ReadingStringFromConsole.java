package com.perscholas.JavaWrapperMathCharacterStringClasses;
import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main (String[] args) {
        //Example 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words followed by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is: " + s1);
        System.out.println("s2 is : " + s2);
        System.out.println("s3 is : " + s3);
        input.close();

    }
}

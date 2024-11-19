package com.perscholas.java_basics;

public class JavaVariablesDemo {
    public static void main(String[] args) {
        // add two integers
        int a = 5;
        int b = 10;
        int intSum = a + b;
        System.out.println(intSum);

        // sum of doubles
        double c = 3.14;
        double d = 8.54;
        double doubleSum = c + d;
        System.out.println(doubleSum);

        // sum of int and double
        int e = 5;
        double f = 2.56;
        double intDoubleSum = e+f;
        System.out.println(intDoubleSum);

        // division of ints/division of double and int
        double largeInt = 25.56;
        int smallInt = 10;
        double divisionOfInts = largeInt/smallInt;
        System.out.println(divisionOfInts);


        // Question 5
        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.

        double num1 = 25.5;
        double num2 = 10.25;
        double numDiv = num1/num2;
        System.out.println((int)numDiv);

        //Question 6
        int x = 5;
        int y = 6;
        double q = (double)y/x;
        System.out.println(q);

        //named constant in a program
        final int RADIUS = 4;
        final double PI = 3.14;
        double areaOfCircle = PI * RADIUS * RADIUS;
        System.out.println(areaOfCircle);

        // CAFE
        final int croissant = 2;
        final int muffin = 3;
        final int bagel = 2;
        final int SALES_TAX = 10;
        double subtotal = 3 * croissant + 4 * muffin + 2 * bagel;
        double totalSale = subtotal + SALES_TAX;
        System.out.println(totalSale);






    }
}

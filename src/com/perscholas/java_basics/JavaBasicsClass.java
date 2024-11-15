package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        // Sum of two int variables
        int a = 5;
        int b = 10;
        int isum = a + b;
        System.out.println(isum);

        //Sum of two double variables
        double dnum1 = 25;
        double dnum2 = 55;
        double dsum = dnum1 + dnum2;
        System.out.println(dsum);

        //Sum of integer and double variable
        int inum = 65;
        double dnum = 56.34;
        double idsum = inum + dnum;
        System.out.println(idsum);

        //Division of two integers
        int c = 15;
        double d = 25.4;
        double dints = d/c;
        System.out.println(dints);

        // Division of two double variables , then cast resul to int
        double dnum5 = 55.4;
        double dnum6 = 56.3;
        double dtotal = dnum5 + dnum6;
        int total = (int)dtotal;
        System.out.println(total);

        // Divide two ints and cast result to a double.

        int x= 5;
        int y= 6;
        double q = y/x;
        System.out.println(q);
        q = (double)y;
        System.out.println(q);

        //area of a circle , named constant used in calculation
        final double PI = 3.14159;
        double radius = 3;
        double area = PI * radius * radius;
        System.out.println(area);

        //Calculate totalSale amount at Cafe

        double croissant = 2;
        double bagel = 2;
        double muffin = 3;
        final int SALES_TAX = 5;
        double subtotal;
        double totalSale;
        subtotal = (3*croissant + 4*bagel + 2*muffin);
        totalSale = subtotal + SALES_TAX;
        System.out.println(totalSale);
    }

}

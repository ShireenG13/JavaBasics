package com.perscholas.java_basics;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class JavaOperatorsAndNumbers {
    public static void main (String[] args) {
        //1
        int x = 88;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Integer.toBinaryString(x));
        //100 , 4.00
        x = x<<1;
        System.out.println(Integer.toBinaryString(x));
        System.out.printf("%.2f", (double)x);

        //2
        int y = 32456;
        System.out.println(Integer.toBinaryString(y));
        y = y>>2;
        //100101 37
        System.out.println(Integer.toBinaryString(y));
        System.out.printf("%.2f", (double)y);

        //3
        int a = 7;
        int b = 17;
        //00001
        int z = a & b;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        //4
        int o = a|b;
        System.out.println(o);
        System.out.println(Integer.toBinaryString(o));

        //5
        int m = 5;
        System.out.println(m);
        m++;
        System.out.println(m);

        //6
        int n = 5;
        n = n+1;
        System.out.println(n);
        n += 1;
        System.out.println(n);
        n++;
        System.out.println(n);

        //7
        int g = 5;
        int h = 8;
        //int sum = ++g + h;
        int sum = g++ + h;
        System.out.println(sum);

    }
}

package com.perscholas.ConditionalsAndLoops;

import java.util.Scanner;

public class SentinalValueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Read initial data
        System.out.println("Enter an int value (the program exits if the input is 0) : ");
        int data = input.nextInt();
        //keep reading data until input is 0
        int sum = 0;
        while( data != 0){
            sum += data;
            System.out.println("Enter an int value (the program exits if the input is 0) : ");
            data = input.nextInt();
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}

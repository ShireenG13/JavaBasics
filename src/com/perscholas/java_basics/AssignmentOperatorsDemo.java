package com.perscholas.java_basics;

public class AssignmentOperatorsDemo {
    public static void main (String [] args){
        //Assigning primitive values
        int j,k;
        j=10;// j gets 10
        j=5;// j gets 5; 10 gets overwritten
        k=j;//k gets 5;
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);
        //Multiple assignments
        k = j = 10; //(k=(j=10))
        System.out.println("k is: " + k);
        System.out.println("j is: " + j);
    }
}

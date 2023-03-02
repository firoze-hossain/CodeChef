package com.codechef.solveProblemUsingJava.conditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        int a = 13;
        int b = 15;
        if (a >= b) {
            System.out.println(a + " is gretaer than and equal to " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }
        a = 14;
        b = 14;
        if (a > b) {
            System.out.println(a + " a is greater than" + b);
        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }


    }
}

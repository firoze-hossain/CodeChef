package com.codechef.java.theANDOperator;

import java.util.Scanner;

public class TheANDOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a != b && a > b) {
            System.out.println("Both a and b are distinct integers");
        }
        else{
            System.out.println("Error 404");
        }
    }

}

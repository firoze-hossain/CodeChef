package com.codechef.java.tableOfAnyNumber;

import java.util.Scanner;

public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}

package com.codechef.solveProblemUsingJava.logicRevProb2;

import java.util.Scanner;

public class LogicRevProb1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();
            if (x <= 3) {
                System.out.println(x * y);
            } else if (x % 3 == 0) {
                System.out.println(((x / 3) - 1) * z + (x * y));
            } else {
                System.out.println((x / 3) * z + (x * y));
            }
        }
    }
}

package com.codechef.solveProblemUsingJava.buildLogicRevProb4;

import java.util.Scanner;

public class BuildLogicRevProb4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int x = read.nextInt();
            int y = read.nextInt();
            if (((500 - 2 * x) + (1000 - 4 * (x + y))) == ((1000 - 4 * y) + (500 - 2 * (x + y)))) {
                System.out.println((500 - 2 * x) + (1000 - 4 * (x + y)));
            } else if (((500 - 2 * x) + (1000 - 4 * (x + y))) > ((1000 - 4 * y) + (500 - 2 * (x + y)))) {
                System.out.println((500 - 2 * x) + (1000 - 4 * (x + y)));
            } else {
                System.out.println((1000 - 4 * y) + (500 - 2 * (x + y)));
            }
        }
    }
}

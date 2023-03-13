package com.codechef.solveProblemUsingJava.weights;

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int w = read.nextInt();
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();
            // Update your code below this line to solve the problem
            if (w >= 0 && x >= 0 && y >= 0 && z >= 0 && w == x || w == y || w == z || w == (x + y) || w == (y + z) || w == (z + x) || w == (x + y + z)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

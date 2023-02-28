package com.codechef.solveProblemUsingJava.burgers;

import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max_num_burgers = Math.min(a, b);
            System.out.println(max_num_burgers);
        }
    }
}

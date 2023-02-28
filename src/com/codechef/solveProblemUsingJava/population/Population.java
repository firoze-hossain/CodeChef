package com.codechef.solveProblemUsingJava.population;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int total_population = x - y;
            total_population = total_population + z;
            System.out.println(total_population);
        }
    }
}

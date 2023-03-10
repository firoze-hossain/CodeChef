package com.codechef.solveProblemUsingJava.problemMOVIE2XComp;

import java.util.Scanner;

public class ProblemMOVIE2XComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int totalMinutes = (x - y) + (y / 2);
        System.out.println(totalMinutes);
    }
}

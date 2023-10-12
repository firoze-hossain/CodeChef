package com.codechef.hundredDays.basicProgram.aOrB;

import java.util.Scanner;

public class AOrB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int maxPointsAToB = (500 - (2 * x)) + (1000 - (4 * (x + y)));
            int maxPointsBToA = (1000 - (4 * y)) + (500 - (2 * (x + y)));
            System.out.println(Math.max(maxPointsAToB, maxPointsBToA));
        }
    }

}

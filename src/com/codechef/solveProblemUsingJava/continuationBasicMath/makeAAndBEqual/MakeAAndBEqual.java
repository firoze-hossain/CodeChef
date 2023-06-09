package com.codechef.solveProblemUsingJava.continuationBasicMath.makeAAndBEqual;

import java.util.Scanner;

public class MakeAAndBEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int minAB = Math.min(a, b);
            int maxAB = Math.max(a, b);
            int flag = 0;
            while (minAB <= maxAB) {
                if (minAB == maxAB) {
                    flag = 1;
                    break;
                } else {
                    minAB = minAB * 2;
                }
            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

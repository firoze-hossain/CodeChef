package com.codechef.practice.dominantArmy;

import java.util.Scanner;

public class DominantArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nA = sc.nextInt();
            int nB = sc.nextInt();
            int nC = sc.nextInt();
            if (nA > nB + nC || nB > nA + nC || nC > nA + nB) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

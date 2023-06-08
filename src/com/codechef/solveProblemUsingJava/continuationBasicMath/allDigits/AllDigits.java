package com.codechef.solveProblemUsingJava.continuationBasicMath.allDigits;

import java.util.ArrayList;
import java.util.Scanner;

public class AllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> a = new ArrayList<>();
            int n = sc.nextInt();
            while (n > 0) {
                a.add(0, n % 10);
                n = n / 10;
            }
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }
            System.out.println();
        }
    }
}

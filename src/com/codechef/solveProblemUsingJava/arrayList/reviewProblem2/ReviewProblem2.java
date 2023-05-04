package com.codechef.solveProblemUsingJava.arrayList.reviewProblem2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            int m1 = 0;
            int d1 = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele);
                if (a.get(i) > m1) {
                    m1 = a.get(i);
                    d1 = i;
                }
            }
            ArrayList<Integer> b = new ArrayList<>();
            int m2 = 0;
            int d2 = 0;
            for (int j = 0; j < n; j++) {
                int ele = sc.nextInt();
                b.add(ele);
                if (b.get(j) > m2) {
                    m2 = b.get(j);
                    d2 = j;
                }
            }
            int s1 = 0;
            int s2 = 0;
            for (int k = 0; k < n; k++) {
                if (k != d1) {
                    s1 = s1 + a.get(k);
                }
                if (k != d2) {
                    s2 = s2 + b.get(k);
                }
            }
            if (s1 < s2) {
                System.out.println("Alice");
            } else if (s1 > s2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        }
    }
}

package com.codechef.solveProblemUsingJava.arrayList.reviewProblem2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewProblem2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele);
            }
            int m = 0;
            for (int j = 0; j < n; j++) {
                if (a.get(j) > k) {
                    m++;
                }
            }
            System.out.println(m);
        }
    }
}

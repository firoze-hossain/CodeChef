package com.codechef.solveProblemUsingJava.arrayList.reviewProblem1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele);
            }
            int m = n;
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j).equals(a.get(j + 1))) {
                    m--;
                }
            }
            System.out.println(m);
        }
    }
}

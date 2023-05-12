package com.codechef.solveProblemUsingJava.arrayList.reviewProblem3;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele);
            }
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                b.add(ele);
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (a.get(j) >= b.get(j))
                        count++;
                } else {
                    if (a.get(j) - a.get(j - 1) >= b.get(j))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}

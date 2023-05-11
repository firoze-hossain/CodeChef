package com.codechef.solveProblemUsingJava.arrayList.reviewProblem4;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            double sum = 0;
            double count = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                list.add(ele);
            }
            for (int j = 0; j < n; j++) {
                if (list.get(j) == a) {
                    sum++;
                }
                if (list.get(j) == b) {
                    count++;
                }
            }
            double result = (sum / n) * (count / n);
            System.out.println(result);
        }
    }
}

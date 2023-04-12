package com.codechef.solveProblemUsingJava.firstAndLast;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
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
            int finalVal = a.get(0) + a.get(n - 1);
            int j = 0;
            while (j < n - 1) {
                int temp = a.get(j) + a.get(j + 1);
                if (temp > finalVal) {
                    finalVal = temp;
                }
                j++;
            }
            System.out.println(finalVal);
        }
    }
}

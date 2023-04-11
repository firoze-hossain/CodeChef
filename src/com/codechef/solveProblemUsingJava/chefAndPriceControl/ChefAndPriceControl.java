package com.codechef.solveProblemUsingJava.chefAndPriceControl;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndPriceControl {
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
            ArrayList<Integer> b = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (a.get(j) > k) {
                    b.add(k);
                } else {
                    b.add(a.get(j));
                }
            }
            int num1 = 0;
            int num2 = 0;
            for (int l = 0; l < a.size(); l++) {
                num1 += a.get(l);
            }
            for (int m = 0; m < b.size(); m++) {
                num2 += b.get(m);
            }
            System.out.println(num1 - num2);
        }
    }
}

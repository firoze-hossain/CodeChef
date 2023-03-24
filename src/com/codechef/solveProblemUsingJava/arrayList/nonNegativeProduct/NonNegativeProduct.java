package com.codechef.solveProblemUsingJava.arrayList.nonNegativeProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NonNegativeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int elem;
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                elem = sc.nextInt();
                a.add(elem);
            }
            int count_neg = 0;
            int count_zero = Collections.frequency(a, 0);
            if (count_zero > 0) {
                System.out.println(0);
            } else {
                int l = 0;
                while (l < n) {
                    if (a.get(l) < 0) {
                        count_neg = count_neg + 1;
                    }
                    l = l + 1;
                }
                if (count_neg % 2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }

            }
        }

    }
}

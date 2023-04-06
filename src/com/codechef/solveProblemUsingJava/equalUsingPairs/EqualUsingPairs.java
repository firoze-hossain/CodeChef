package com.codechef.solveProblemUsingJava.equalUsingPairs;

import java.util.Arrays;
import java.util.Scanner;

public class EqualUsingPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
           // System.out.println(a.length);
            Arrays.sort(a);
            int count = 1;
            int highestCount = 1;
            for (int i = 0; i < n - 1; i++) {
                count = count + 1;
                if (a[i] == a[i + 1]) {
                    if (highestCount <= count) {
                        highestCount = count;
                    }
                } else {
                    count = 1;
                }
            }
            System.out.println(n - highestCount);
        }

    }
}



package com.codechef.solveProblemUsingJava.continuationBasicMath;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuationBasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    a.add(i);
                }
            }
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }
            System.out.println();
        }
    }
}

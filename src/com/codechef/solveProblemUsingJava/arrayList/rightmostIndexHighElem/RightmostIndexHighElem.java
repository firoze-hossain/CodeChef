package com.codechef.solveProblemUsingJava.arrayList.rightmostIndexHighElem;

import java.util.ArrayList;
import java.util.Scanner;

public class RightmostIndexHighElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                a.add(k);
            }
            int large = -100;
            int right = 0;
            int j = 0;
            while (j < n) {
                if (a.get(j) >= large) {
                    large = a.get(j);
                    right = j;
                }
                j++;
            }
            System.out.println(large + " " + right);
        }
    }
}

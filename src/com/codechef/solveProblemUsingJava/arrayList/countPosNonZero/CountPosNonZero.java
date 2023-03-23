package com.codechef.solveProblemUsingJava.arrayList.countPosNonZero;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPosNonZero {
    public static void main(String[] args) {
        int elem;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                elem = sc.nextInt();
                a.add(elem);
            }
            int pos = 0;
            int neg = 0;
            int divk = 0;
            int l = 0;
            while (l < a.size()) {
                if (a.get(l) < 0) {
                    neg = neg + 1;
                } else if (a.get(l) > 0) {
                    pos = pos + 1;

                }
                if (a.get(l) % k == 0) {
                    divk = divk + 1;
                }
                l = l + 1;
            }
            System.out.println(pos + " " + neg + " " + divk);
        }
    }
}

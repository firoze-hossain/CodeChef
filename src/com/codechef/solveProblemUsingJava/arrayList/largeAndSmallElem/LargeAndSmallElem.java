package com.codechef.solveProblemUsingJava.arrayList.largeAndSmallElem;

import java.util.ArrayList;
import java.util.Scanner;

public class LargeAndSmallElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int elem;
        while (t-- > 0) {
            ArrayList<Integer> a = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                elem = sc.nextInt();
                a.add(elem);
            }
            int small = a.get(0);
            int large = a.get(0);
            int l = 0;
            while (l < a.size()) {
                if (a.get(l) > large) {
                    large = a.get(l);
                }
                if (a.get(l) < small) {
                    small = a.get(l);
                }
                l = l + 1;
            }
            System.out.println(small + " " + large);
        }
    }
}

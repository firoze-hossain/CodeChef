package com.codechef.solveProblemUsingJava.arrayList.arrayToLeft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToLeft {
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
            int m = a.size();
            int minElem = a.get(0);
            int minElementIndex = 0;
            int l = 1;
            while (l < m) {
                if (a.get(l) < minElem) {
                    minElem = a.get(l);
                    minElementIndex = l;
                }
                l++;
            }
            int k = minElementIndex;
            while (k > 0) {
                Collections.swap(a, k, k - 1);
                k = k - 1;
            }
            for (int x = 0; x < n; x++) {
                System.out.print(a.get(x) + " ");
            }
            System.out.println("\n");
        }
    }
}

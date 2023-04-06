package com.codechef.solveProblemUsingJava.uniqueElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueElements {
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
            HashSet<Integer> unique = new HashSet(a);
            ArrayList<Integer> uniquesort = new ArrayList<>(unique);
            Collections.sort(uniquesort);
            ArrayList<Integer> freq = new ArrayList<>();
            for (int i = 0; i < uniquesort.size(); i++) {
                freq.add(Collections.frequency(a, uniquesort.get(i)));
            }
            System.out.println(uniquesort);
            System.out.println(freq);
        }

    }
}

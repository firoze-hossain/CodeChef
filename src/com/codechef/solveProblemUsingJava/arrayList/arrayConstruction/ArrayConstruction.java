package com.codechef.solveProblemUsingJava.arrayList.arrayConstruction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> a = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a.add(i);
            }
            System.out.println(a);
            Collections.sort(a, Collections.reverseOrder());
            System.out.println(a);
        }
    }
}

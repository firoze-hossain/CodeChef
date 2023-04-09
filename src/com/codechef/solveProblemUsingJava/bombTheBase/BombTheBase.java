package com.codechef.solveProblemUsingJava.bombTheBase;

import java.util.ArrayList;
import java.util.Scanner;

public class BombTheBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                a.add(ele);
            }
            int j = 0;
            int attackedHouse = 0;
            while (j < n) {
                if (a.get(j) < x) {
                    attackedHouse = j + 1;
                }
                j++;
            }
            System.out.println(attackedHouse);
        }
    }
}

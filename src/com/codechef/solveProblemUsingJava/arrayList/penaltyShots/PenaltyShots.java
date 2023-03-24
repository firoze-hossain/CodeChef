package com.codechef.solveProblemUsingJava.arrayList.penaltyShots;

import java.util.ArrayList;
import java.util.Scanner;

public class PenaltyShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int elem;
        while (t-- > 0) {
            int n = 10;
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                elem = sc.nextInt();
                a.add(elem);
            }
            int team1 = a.get(0) + a.get(2) + a.get(4) + a.get(6) + a.get(8);
            int team2 = a.get(1) + a.get(3) + a.get(5) + a.get(7) + a.get(9);
            if (team1 == team2) {
                System.out.println(0);
            } else if (team1 > team2) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}

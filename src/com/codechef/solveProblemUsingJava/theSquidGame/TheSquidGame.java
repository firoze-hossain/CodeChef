package com.codechef.solveProblemUsingJava.theSquidGame;

import java.util.ArrayList;
import java.util.Scanner;

public class TheSquidGame {
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
            int total_prize = 0;
            int mn = a.get(0);
            for (int i = 0; i < n; i++) {
                total_prize = total_prize + a.get(i);
                mn = Math.min(mn, a.get(i));
            }
            int max_prize = total_prize - mn;
            System.out.println(max_prize);
        }

    }
}

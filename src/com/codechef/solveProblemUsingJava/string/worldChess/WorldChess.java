package com.codechef.solveProblemUsingJava.string.worldChess;

import java.util.Scanner;

public class WorldChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next();
            int carlsen = 0;
            int chef = 0;
            for (int i = 0; i < 14; i++) {
                if (s.charAt(i) == 'C') {
                    carlsen = carlsen + 2;
                } else if (s.charAt(i) == 'N') {
                    chef = chef + 2;
                } else {
                    carlsen = carlsen + 1;
                    chef = chef + 1;
                }
            }
            int carlsen_amount = 0;
            if (carlsen > chef) {
                carlsen_amount = 60 * x;
            } else if (chef > carlsen) {
                carlsen_amount = 40 * x;
            } else {
                carlsen_amount = 55 * x;
            }
            System.out.println(carlsen_amount);
        }
    }
}

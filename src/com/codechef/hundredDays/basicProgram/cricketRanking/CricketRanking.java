package com.codechef.hundredDays.basicProgram.cricketRanking;

import java.util.ArrayList;
import java.util.Scanner;

public class CricketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                a.add(sc.nextInt());
            }
            for (int j = 0; j < 3; j++) {
                b.add(sc.nextInt());
            }
            int countA = 0;
            int countB = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    countA++;
                } else {
                    countB++;
                }
            }
            if (countA > countB) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

}

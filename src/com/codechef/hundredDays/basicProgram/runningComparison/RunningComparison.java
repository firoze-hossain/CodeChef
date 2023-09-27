package com.codechef.hundredDays.basicProgram.runningComparison;

import java.util.ArrayList;
import java.util.Scanner;

public class RunningComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> alice = new ArrayList<>();
            ArrayList<Integer> bob = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int aliceRun = sc.nextInt();
                alice.add(aliceRun);
            }
            for (int i = 0; i < n; i++) {
                int bobRun = sc.nextInt();
                bob.add(bobRun);
            }
            for (int i = 0; i < n; i++) {
                if (alice.get(i) * 2 >= bob.get(i) && bob.get(i) * 2 >= alice.get(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

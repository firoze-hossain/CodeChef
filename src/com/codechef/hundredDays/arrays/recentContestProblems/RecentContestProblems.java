package com.codechef.hundredDays.arrays.recentContestProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class RecentContestProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count1 = 0;
            int count2 = 0;
            ArrayList<String> list = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                list.add(s);
                if (list.get(i).equals("START38")) {
                    count1++;
                } else {
                    count2++;
                }
            }
            System.out.println(count1 + " " + count2);
        }
    }
}

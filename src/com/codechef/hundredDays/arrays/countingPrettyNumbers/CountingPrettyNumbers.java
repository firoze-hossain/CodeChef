package com.codechef.hundredDays.arrays.countingPrettyNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingPrettyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = l; i <= r; i++) {
                list.add(i);
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 10 == 2 || list.get(i) % 10 == 3 || list.get(i) % 10 == 9) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}


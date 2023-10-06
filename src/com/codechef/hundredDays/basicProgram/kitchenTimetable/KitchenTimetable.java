package com.codechef.hundredDays.basicProgram.kitchenTimetable;

import java.util.Scanner;

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] list1 = new int[n + 1];
            int[] list2 = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                list1[i] = sc.nextInt();
            }
            for (int i = 1; i < n + 1; i++) {
                list2[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 1; i < n + 1; i++) {
                if (list1[i] - list1[i - 1] >= list2[i]) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

}

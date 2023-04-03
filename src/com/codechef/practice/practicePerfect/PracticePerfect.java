package com.codechef.practice.practicePerfect;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PracticePerfect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();
        int arr[] = new int[]{p1, p2, p3, p4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                count++;
            }
        }
        System.out.println(count);
    }

}

package com.codechef.hundredDays.basicProgram.goodWeather;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count1 = 0;
            int count2 = 0;
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                String s = sc.next();
                list.add(s);
            }
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        count1++;
                    } else {
                        count2++;
                    }
                }
            }
            if (count1 > count2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

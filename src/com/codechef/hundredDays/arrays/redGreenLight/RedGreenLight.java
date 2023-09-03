package com.codechef.hundredDays.arrays.redGreenLight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedGreenLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                list.add(m);

            }
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) > k) {
                    count = count + 1;
                }
            }
            System.out.println(count);
        }
    }

}

package com.codechef.hundredDays.basicProgram.selfDefenceTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfDefenceTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                list.add(k);
            }
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i) >= 10 && list.get(i) <= 60) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}

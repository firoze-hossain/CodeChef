package com.codechef.hundredDays.basicProgram.economicsClass;

import java.util.ArrayList;
import java.util.Scanner;

public class EconomicsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            ArrayList<Integer> supply = new ArrayList<Integer>();
            ArrayList<Integer> demand = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                supply.add(s);
            }
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                demand.add(d);
            }
            for (int i = 0; i < supply.size(); i++) {
                if (supply.get(i) == demand.get(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

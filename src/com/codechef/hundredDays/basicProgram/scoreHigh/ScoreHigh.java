package com.codechef.hundredDays.basicProgram.scoreHigh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                list.add(sc.nextInt());
            }
            int result = Collections.max(list);
            System.out.println(result);
        }
    }

}

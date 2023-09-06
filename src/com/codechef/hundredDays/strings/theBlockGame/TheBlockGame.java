package com.codechef.hundredDays.strings.theBlockGame;

import java.util.Scanner;

public class TheBlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String st = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                st = st + s.charAt(i);
            }
            if (s.equals(st)) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
    }
}

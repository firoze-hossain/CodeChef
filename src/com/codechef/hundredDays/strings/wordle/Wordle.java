package com.codechef.hundredDays.strings.wordle;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String st1 = sc.next();
            String st2 = sc.next();
            String m = "";
            for (int i = 0; i < 5; i++) {
                if (st1.charAt(i) == st2.charAt(i)) {
                    m = m + "G";
                } else {
                    m = m + "B";
                }
            }
            System.out.println(m);
        }
    }
}


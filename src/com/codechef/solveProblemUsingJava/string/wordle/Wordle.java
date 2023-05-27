package com.codechef.solveProblemUsingJava.string.wordle;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String n = sc.next();
            String m = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == n.charAt(i)) {
                    m = m + 'G';
                } else {
                    m = m + 'B';
                }
            }
            System.out.println(m);
        }
    }
}

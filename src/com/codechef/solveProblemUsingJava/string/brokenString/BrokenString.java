package com.codechef.solveProblemUsingJava.string.brokenString;

import java.util.Scanner;

public class BrokenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int flag = 0;
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) == s.charAt(n / 2 + i)) {
                    flag = 1;
                }else {
                    flag=0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

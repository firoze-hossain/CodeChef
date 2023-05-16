package com.codechef.solveProblemUsingJava.string.binaryString;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int a_count = 0;
            int b_count = 0;
            int common = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '1') {
                    a_count = a_count + 1;
                }
            }
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == '1') {
                    b_count = b_count + 1;
                }
            }
            int l = 0;
            int n = a.length();
            while (l < n) {
                if (a.charAt(l) == b.charAt(l)) {
                    common = common + 1;
                }
                l++;
            }
            System.out.println(a_count + " " + b_count + " " + common);
        }
    }
}

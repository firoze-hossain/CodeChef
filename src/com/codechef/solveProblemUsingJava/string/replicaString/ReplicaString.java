package com.codechef.solveProblemUsingJava.string.replicaString;

import java.util.Scanner;

public class ReplicaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String a = "";
            for (int i = 0; i < s.length(); i++) {
                a = a + s.charAt(i);
            }
            String b = "";
            for (int j = 0; j < s.length(); j++) {
                b = a.charAt(j) + b;
            }
            System.out.println(a);
            System.out.println(b);
        }
    }
}

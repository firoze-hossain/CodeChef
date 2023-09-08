package com.codechef.hundredDays.math.jengaNight;

import java.util.Scanner;

public class JengaNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == x) {
                System.out.println("Yes");
            } else if (x % n == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

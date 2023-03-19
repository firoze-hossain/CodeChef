package com.codechef.practice.codechefAirlines;

import java.util.Scanner;

public class CodechefAirlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x * 10 >= y) {
                System.out.println(y * z);
            } else {
                System.out.println(x * 10 * z);
            }
        }
    }
}

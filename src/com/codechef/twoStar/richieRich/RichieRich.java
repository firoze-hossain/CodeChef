package com.codechef.twoStar.richieRich;

import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int result = (b - a) / x;
            System.out.println(result);
        }
    }
}

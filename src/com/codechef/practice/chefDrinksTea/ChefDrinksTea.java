package com.codechef.practice.chefDrinksTea;

import java.util.Scanner;

public class ChefDrinksTea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == y || y > x) {
                System.out.println(z);
            } else if (x > y && x % y == 0) {
                System.out.println(x / y * z);
            } else {
                System.out.println(((x / y) + 1) * z);
            }

        }
    }
}

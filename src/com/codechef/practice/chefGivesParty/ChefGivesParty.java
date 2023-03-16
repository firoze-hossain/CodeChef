package com.codechef.practice.chefGivesParty;

import java.util.Scanner;

public class ChefGivesParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            if (k >= (n * x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

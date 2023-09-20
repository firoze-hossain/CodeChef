package com.codechef.hundredDays.basicProgram.chefOnIsland;

import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            double xr = sc.nextInt();
            double yr = sc.nextInt();
            double d = sc.nextInt();
            double d1 = Math.min(x / xr, y / yr);
            if (d1 >= d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

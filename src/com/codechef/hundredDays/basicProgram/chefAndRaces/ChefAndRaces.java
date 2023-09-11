package com.codechef.hundredDays.basicProgram.chefAndRaces;

import java.util.Scanner;

public class ChefAndRaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            if (x != a && y != b && x != b && y != a) {
                count += 2;
            } else if (x != a && y == b || x == a && y != b || x == b && y != a || x != b && y == a) {
                count++;
            } else {
                count = 0;
            }
            System.out.println(count);
        }
    }
}

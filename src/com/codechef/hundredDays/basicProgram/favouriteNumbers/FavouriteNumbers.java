package com.codechef.hundredDays.basicProgram.favouriteNumbers;

import java.util.Scanner;

public class FavouriteNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a % 2 == 0 && a % 7 == 0) {
                System.out.println("Alice");
            } else if (a % 2 != 0 && a % 9 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}

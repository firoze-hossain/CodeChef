package com.codechef.hundredDays.basicProgram.sportsSection;

import java.util.Scanner;

public class SportsSection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 8 && n <= 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

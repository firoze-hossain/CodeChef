package com.codechef.twoStar.vaccineDates;

import java.util.Scanner;

public class VaccineDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (d >= l && d <= r) {
                System.out.println("Take second dose now");
            } else if (d < l) {
                System.out.println("Too Early");
            } else {
                System.out.println("Too Late");
            }
        }
    }
}

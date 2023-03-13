package com.codechef.solveProblemUsingJava.buildingRace;

import java.util.Scanner;

public class BuildingRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((a / x) > (b / y)) {
                System.out.println("Chefina");
            } else if ((a / x) < (b / y)) {
                System.out.println("Chef");
            } else if ((a / x) == (b / x)) {
                System.out.println("Both");
            }
        }
    }
}

package com.codechef.hundredDays.basicProgram.chefAndVacationTransportation;

import java.util.Scanner;

public class ChefAndVacationTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x + y < z) {
                System.out.println("PLANEBUS");
            } else if (x + y > z) {
                System.out.println("TRAIN");
            } else {
                System.out.println("Equal");
            }
        }
    }
}

package com.codechef.hundredDays.basicProgram.returnTheChange;

import java.util.Scanner;

public class ReturnTheChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((int) (100 - (Math.round(x / 10.0f) * 10)));

        }
    }

}

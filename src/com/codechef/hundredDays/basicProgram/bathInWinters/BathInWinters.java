package com.codechef.hundredDays.basicProgram.bathInWinters;

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > x) {
                System.out.println(0);
            } else {
                System.out.println(x / (y * 2));
            }
        }
    }

}

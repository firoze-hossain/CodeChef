package com.codechef.hundredDays.basicProgram.lazyChef;

import java.util.Scanner;

public class LazyChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int result = Math.min(x * m, x + d);
            System.out.println(result);
        }
    }
}

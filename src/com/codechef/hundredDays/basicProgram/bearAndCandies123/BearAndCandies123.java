package com.codechef.hundredDays.basicProgram.bearAndCandies123;

import java.util.Scanner;

public class BearAndCandies123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int maxChocolate = Math.max(a, b);
            String result = "";
            for (int i = 1; i <= maxChocolate; i++) {
                if (i * i > a) {
                    result = "Bob";
                    break;
                } else if (i * (i + 1) > b) {
                    result = "Limak";
                    break;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }

}

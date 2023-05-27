package com.codechef.practice.array.smallFactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger bigInteger = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            }
            System.out.println(bigInteger);
        }
    }
}

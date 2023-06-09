package com.codechef.solveProblemUsingJava.continuationBasicMath.mathLibraries;

import java.math.BigInteger;

public class MathLibraries {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("4");
        BigInteger b = new BigInteger("9");
        System.out.println(a.gcd(b));

        double n1 = 1.89;
        System.out.println(Math.floor(n1));

        double n2 = 1.21;
        System.out.println(Math.ceil(n2));

        int x = 4;
        int y = 3;
        System.out.println(Math.pow(x, y));
    }
}

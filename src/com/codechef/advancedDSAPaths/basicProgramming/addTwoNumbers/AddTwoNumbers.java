package com.codechef.advancedDSAPaths.basicProgramming.addTwoNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddTwoNumbers {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader inputReader = new InputReader(inputStream);
        int t = inputReader.nextInt();
        while (t-- > 0) {
            int a = inputReader.nextInt();
            int b = inputReader.nextInt();
            System.out.println(a + b);
        }
    }

    static class InputReader {
        public BufferedReader bufferedReader;
        public StringTokenizer stringTokenizer;

        public InputReader(InputStream inputStream) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 32768);
            stringTokenizer = null;
        }

        public String next() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            return stringTokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

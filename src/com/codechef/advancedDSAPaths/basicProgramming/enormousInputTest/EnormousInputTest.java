package com.codechef.advancedDSAPaths.basicProgramming.enormousInputTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EnormousInputTest {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        InputReader inputReader = new InputReader(inputStream);
        int n = inputReader.nextInt();
        int k = inputReader.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = inputReader.nextInt();
            if (x % k == 0) {
                ans++;
            }
        }
        System.out.println(ans);
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

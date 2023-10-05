package com.codechef.hundredDays.basicProgram.easyPronunciation;

import java.util.Scanner;

public class EasyPronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    System.out.println("No");
                    break;
                }
            }
            if (count != 4) {
                System.out.println("Yes");
            }

        }
    }

}

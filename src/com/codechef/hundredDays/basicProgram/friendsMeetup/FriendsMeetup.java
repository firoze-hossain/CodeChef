package com.codechef.hundredDays.basicProgram.friendsMeetup;

import java.util.Scanner;

public class FriendsMeetup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            if (x1 == x2) {
                System.out.println("Yes");
            } else if (x1 > x2) {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }
        }
    }

}

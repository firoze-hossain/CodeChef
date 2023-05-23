package com.codechef.practice.array.theLeadGame;

import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int player1 = 0;
        int player2 = 0;
        int max = 0;
        int winner = 0;
        while (n-- > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            player1 += n1;
            player2 += n2;
            int lead = Math.abs(player1 - player2);
            if (lead > max) {
                max = lead;
                winner = (player1 > player2) ? 1 : 2;
            }

            System.out.println(winner + " " + max);


        }
    }
}

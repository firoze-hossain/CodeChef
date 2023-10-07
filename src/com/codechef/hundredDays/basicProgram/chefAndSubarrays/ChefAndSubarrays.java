package com.codechef.hundredDays.basicProgram.chefAndSubarrays;

import java.util.Scanner;

public class ChefAndSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = findNumOfSubArray(arr, n);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int findNumOfSubArray(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int product = 1;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                product *= arr[j];
                if (sum == product) {
                    count++;
                }
            }
        }
        return count;
    }

}

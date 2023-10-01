package com.codechef.hundredDays.basicProgram.largestAndSecondLargest;

import java.util.*;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Set<Integer> set = new HashSet<>();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            int result;
            ArrayList<Integer> list1 = new ArrayList<>(set);
            Collections.sort(list1);
            int lastIndex = list1.size() - 1;
            int lastIndexValue = list1.get(lastIndex);
            int lastPreviousIndex = lastIndex - 1;
            int lastPrevousIndexValue = list1.get(lastPreviousIndex);
            result = lastIndexValue + lastPrevousIndexValue;
            System.out.println(result);
        }
    }
}

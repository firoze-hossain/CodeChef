package com.codechef.solveProblemUsingJava.arrayList.arrayOp1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOp1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //adding
        list.add(23);
        list.add(25);
        list.add(29);
        System.out.println("Created List: " + list);
        //sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        //frequency
        System.out.println("Occurrence in 29: " + Collections.frequency(list, 29));
        //swap
        Collections.swap(list, 0, 2);
        System.out.println("Arraylist after swapping first and last element: " + list);
    }
}

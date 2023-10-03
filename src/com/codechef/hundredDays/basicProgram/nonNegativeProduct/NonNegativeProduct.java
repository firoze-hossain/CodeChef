package com.codechef.hundredDays.basicProgram.nonNegativeProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class NonNegativeProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    ArrayList<Integer>list=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        list.add(sc.nextInt());
		    }
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<list.size();i++){
		        if(list.get(i)<0){
		            count1++;
		        }else if(list.get(i)==0){
		            count2++;
		        }
		    }
		    if(count1%2==0 || count2>=1){
		      System.out.println(0);
		    }else{
		       System.out.println(1);
		    }
		   
		}
    }
}
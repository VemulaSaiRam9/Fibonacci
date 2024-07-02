package com.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n,t1=0,t2=1;
		Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
		    n=sc.nextInt();
			sc.close();
		    System.out.println("fibonacci number");
		      for(int i=0;i<=n;i++) {
			System.out.print(t1+" ");
			 int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}

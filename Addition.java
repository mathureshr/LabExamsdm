package com;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=a+b;
		System.out.println("sum of given two numbers is " + c);
	}
}

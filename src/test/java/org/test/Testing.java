package org.test;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <=10; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}}
	



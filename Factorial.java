package com.arithematic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter number: ");
		int f=s.nextInt();
		int result=factorial(f);
		System.out.println(result);
	}

	public static int factorial(int f) {
		int result=1;
		for(int i=1; i<=f; i++){
			result=result*i;
		}
		return result;
	}
}

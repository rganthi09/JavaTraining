package com.arithematic;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = s.nextInt();
		int result = factorial(n);
		System.out.println(result);
				
	}

	public static int factorial(int n) {
		if (n==0){
			return 1;
		}else {
			return n * factorial(n-1);
		}
		
	}

}

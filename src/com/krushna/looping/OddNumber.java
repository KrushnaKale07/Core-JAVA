package com.krushna.looping;

import java.util.Scanner;
public class OddNumber {
	
	public int test(int a)
	{
		return a;
	}
	
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a number");
		//int num =  scanner.nextInt();
		
		OddNumber a = new OddNumber();
		int num = a.test(5);
		
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
	}
}

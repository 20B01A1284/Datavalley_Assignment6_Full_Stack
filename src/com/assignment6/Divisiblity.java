package com.assignment6;

import java.util.Scanner;

public class Divisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 7 == 0 && num % 13 == 0)
		{
			System.out.println(num+" is divisible by 7 and 13 simultaneously.");
			System.out.println("quotient is "+(num / 7)+" and remainder is "+(num % 7)+" when "+num+" is divisible by 7");
			System.out.println("quotient is "+(num / 13)+" and remainder is "+(num % 13)+" when "+num+" is divisible by 13");
			
		}
		else
		{
			System.out.println(num+" is not divisible by 7 and 13 simultaneously.");
		}
	}

}
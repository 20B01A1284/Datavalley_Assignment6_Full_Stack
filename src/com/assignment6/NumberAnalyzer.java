package com.assignment6;

import java.util.Scanner;

public class NumberAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition = true;
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while(condition)
		{
			System.out.println("Enter number or (enter 'done' to finish) : ");
			String input = sc.next();
			if(input.equalsIgnoreCase("done"))
			{
				condition = false;
			}
			else
			{
				if(Integer.parseInt(input) > max)
				{
					max = Integer.parseInt(input);
				}
				if(Integer.parseInt(input)< min)
				{
					min = Integer.parseInt(input);
				}
			}
		}
		System.out.println("Largest number is "+max+" and smallest number is "+min);

	}

}
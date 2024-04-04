package com.assignment6;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity : ");
		int quantity = sc.nextInt();
		System.out.println("Enter price per item : ");
		double price_per_item =  sc.nextDouble();
		double expenses = price_per_item * quantity;
		
		if (quantity > 50)
		{
			System.out.println("Total expenses after discount : "+ (expenses - (0.1 * expenses)));
		}
		else if (quantity >= 25 && quantity <= 50)
		{
			System.out.println("Total expenses after discount : "+ (expenses - (0.05 * expenses)));
		}
		else
		{
			System.out.println("no discount and Total expenses  : "+ expenses );
			
		}
	}

}

package com.assignment6;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current year: ");
		int curr_year = sc.nextInt();
		System.out.println("Enter joined year: ");
		int joined_year = sc.nextInt();
		int service = curr_year - joined_year;
		if (service > 5)
		{
			System.out.println("Bonus Rs.5000 is awarded");
		}
		else if(service >= 3 && service <= 5)
		{
			System.out.println("Bonus Rs.3000 is awarded");
		}
		else
		{
			System.out.println("no bonus is awarded.");
		}
	}

}

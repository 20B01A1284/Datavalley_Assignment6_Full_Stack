package com.assignment6;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int returned_late = sc.nextInt();
		if (returned_late <= 7)
		{
			System.out.println("Fine is 50 Paisa");
		}
		else if(returned_late >= 8 && returned_late <= 14)
		{
			System.out.println("Fine is 1 Rupee");
		}
		else if(returned_late > 14 && returned_late <= 21 )
		{
			System.out.println("Fine is 5 Rupees");
		}
		else
		{
			System.out.println("membership is cancelled");
		}
	}

}

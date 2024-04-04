package com.assignment6;

import java.util.HashMap;
import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		str = str.toLowerCase();
		int flag = 1, cnt_vowels = 0;
		for(int i = 0;i < str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				flag = 0;
				cnt_vowels++;
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		if (flag == 1)
		{
			System.out.println("No vowewls were present");
		}
		else
		{
			System.out.println("Count of vowels present in a string : "+cnt_vowels);
			for(Character key : hm.keySet())
			{
				System.out.println(key+ " : " + hm.get(key));
			}
		}
		
		
        
	}

}

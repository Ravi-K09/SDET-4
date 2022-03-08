package com.crm_practiceIN;

import java.util.Scanner;

public class SumOfEvens1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, oddSum = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 1)
			{
				oddSum =oddSum + a[i]; 
			}
		}		
		System.out.println("\n The Sum of odd Numbers in this Array = " + oddSum);
	}
}

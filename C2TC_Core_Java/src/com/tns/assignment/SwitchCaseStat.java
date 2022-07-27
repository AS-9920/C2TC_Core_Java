package com.tns.assignment;
import java.util.Scanner;

public class SwitchCaseStat 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day;
		System.out.println("Enter Any Day");
		day = input.nextInt();
		switch(day)
		{
			case 1 : 
				System.out.println("Sunday");
				break;
			case 2 :
				System.out.println("Monday");
				break;
			case 3 :	
				System.out.println("Tuesday");
				break;
			case 4 :
				System.out.print("Wedneshday");
				break;
			default :
				System.out.println("Invalid Input");
				break;
		}
	}

}

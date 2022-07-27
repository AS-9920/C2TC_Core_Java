//Eligible for Marriage or nor checking using Decision Making 
package com.tns.assignment;
import java.util.Scanner;

public class DecisionMaking
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("Enter Your Age");
		age = input.nextInt();
		if(age>=18)
		System.out.print("Congratulation You are Eligible");
		else
		System.out.print("Padhai Me Dhyan De Phele");
	}

}

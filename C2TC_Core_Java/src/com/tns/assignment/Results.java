package com.tns.assignment;
import java.util.Scanner;

public class Results 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sub1;
		float sub2;
		System.out.println("First Subject Marks");
		sub1 = input.nextInt();
		System.out.println("Second Subject Marks");
		sub2 = input.nextFloat();
		int OutOf=500;
		double Results = sub1+sub2/OutOf*100;
		System.out.println("Result is " +Results);
	}

}

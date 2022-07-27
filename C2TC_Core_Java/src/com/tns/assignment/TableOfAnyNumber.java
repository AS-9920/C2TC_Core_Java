//Program to print Table of Any Number
package com.tns.assignment;
import java.util.Scanner;

public class TableOfAnyNumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num, i;
		System.out.println("Enter Number for Table");
		num = input.nextInt();
		for(i=1;i<=10;i++)
		System.out.println("Table of " +num+" is " +num*i);
		}
}

//Print Number in a Range from user Input
package com.tns.assignment;
import java.util.Scanner;

public class ForLoop
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,i;
		System.out.println("Enter Your Value");
		a = input.nextInt();
		for(i=1;i<=a;i++)
		System.out.println(i);
	}
}

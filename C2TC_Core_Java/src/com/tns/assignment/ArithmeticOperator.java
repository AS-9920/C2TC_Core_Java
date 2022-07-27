//Arithmetic Operator using User Input
package com.tns.assignment;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter First Number");
		a = input.nextInt();
		System.out.println("Enter Second Number");
		b = input.nextInt();
		System.out.println(a+b);
		System.out.println(++a);
		System.out.println(--b);
	}

}

package com.tns.weekendexercise;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int x=0,y=1;		//assign value to x as 0 and y as 1
		System.out.print(x+" "+y);
		int z;
		for(int i=0;i<=10;i++)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
	}
}

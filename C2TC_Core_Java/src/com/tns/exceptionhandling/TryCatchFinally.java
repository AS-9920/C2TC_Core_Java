package com.tns.exceptionhandling;

public class TryCatchFinally 
{
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		finally
		{
		System.out.println("ABCDEFG");
		}
	}
}

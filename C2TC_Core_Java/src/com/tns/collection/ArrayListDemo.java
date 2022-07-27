package com.tns.collection;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Adarsh");   //add, remove inbuilt methods in java
		al.add("Atish");
		al.add(10);
		al.add(null);
		al.remove(3);
		al.add(3,"Hellow");
		System.out.println(al);
	}
}

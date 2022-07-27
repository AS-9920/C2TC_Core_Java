package com.tns.multithreading;

public class SimpleThread extends Thread
{
	public void run()
	{
		System.out.println(" Thread started Running");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SimpleThread st = new SimpleThread();
		st.start();
	}
}
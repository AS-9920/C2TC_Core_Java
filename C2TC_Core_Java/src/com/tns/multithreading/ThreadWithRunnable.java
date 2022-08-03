package com.tns.multithreading;

class MyThreads implements Runnable
	{
		public void run()
		{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		}
	}
		public class ThreadWithRunnable 
	{
		public static void main(String[] args) 
		{
		MyThreads my = new MyThreads();
		Thread t = new Thread(my);
		t.start();			
		}
	}

//creating Thread using Thread Class
package com.tns.multithreading;

class MyThread extends Thread 		//Crating Thread 
{
	public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("My First Thread");
	}
	}
}

public class FirstThread 
	{
		public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}

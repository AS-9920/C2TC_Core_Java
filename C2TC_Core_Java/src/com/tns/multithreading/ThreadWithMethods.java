package com.tns.multithreading;

class ChildThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Adarsh Thread");
		try 
		{
		   Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
}
public class ThreadWithMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChildThread t = new ChildThread();
		t.start();
		//t.join();
		//t.join(2000);
		t.join(3000, 100);
		for(int i=0;i<10;i++)
		{
			System.out.println("Amol Thread");
		}
	}

}

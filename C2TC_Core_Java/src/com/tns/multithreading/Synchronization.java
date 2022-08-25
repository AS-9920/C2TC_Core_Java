package com.tns.multithreading;
//program on Synchronized
	class Count1
		{
		int count;
		public synchronized void inc()
		{
		count ++;
		}
		}
		public class Synchronization 
		{
		public static void main(String[] args) throws InterruptedException
	    {
		Count1 c = new Count1();
		Thread t1 = new Thread (new Runnable() 
		{
		public void run()
		{
		for (int i=1;i<=10000;i++)
		{
		c.inc();
		}
		}
		});

		Thread t2= new Thread (new Runnable()
		{
	    public void run()
	    {
    	for(int i=1; i<=10000; i++)
   		c.inc();
	    }
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}

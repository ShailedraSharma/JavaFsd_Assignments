class MyThread {
	public synchronized void print1to10()
	{
		try{
		for(int i=1;i<=10;i++)
		{
		System.out.println("i = " +i);
		Thread.sleep(100);
		}
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}

class ThreadA extends Thread{
	MyThread mt;
	ThreadA(MyThread mt)
	{
		this.mt=mt;
	}
	
	public void run()
	{
		mt.print1to10();
	}
}

class ThrMainClass{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("1234556");

		MyThread mt1 = new MyThread();	

		ThreadA ta1  = new ThreadA(mt1);
		ta1.start(); 
		ThreadA ta2  = new ThreadA(mt1);
		ta2.start(); 	
		
		
		System.out.println("xyz");
		System.out.println("Main Ends");
	}

}
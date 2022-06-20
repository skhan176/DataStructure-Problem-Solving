package MultiThread;


	
	 class MyThread extends Thread 
	 //output
	 
	 // MyThread foo
	{
	    MyThread() 
	    {
	        System.out.print(" MyThread");
	    }
	    public void run() 
	    {
	        System.out.print(" bar");
	    }
	    public void run(String s) 
	    {
	        System.out.println(" baz");
	    }
	}
	public  class Test1 
	{
	    public static void main (String [] args) 
	    {
	        Thread t = new MyThread() 
	        {
	            public void run() 
	            {
	                System.out.println(" foo");
	            }
	        };
	        t.start();
	    }
	}


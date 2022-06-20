package MultiThread;


	
	public class TWOStartandOneRun extends Thread
	
	// Runtime errors
	// because two threads can not run together
	{
	    String myName;
	    TWOStartandOneRun(String name)
	    {
	        myName = name;
	    }
	    public void run()
	    {
	        for(int i=0; i<100;i++)
	        {
	            System.out.println(myName);
	        }
	    }
	    public static void main(String args[]) throws InterruptedException
	    {
	        TWOStartandOneRun mt1 = new TWOStartandOneRun("mt1");
			TWOStartandOneRun mt2 = new TWOStartandOneRun("mt2");
			mt1.start();
			// XXX
			mt2.start();
	    }
	}



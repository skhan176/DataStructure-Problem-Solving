package MultiThread;

	public class Test extends Thread implements Runnable
	{
		public void run()
		{
			System.out.printf("GFG ");
		}
		public static void main(String[] args) throws InterruptedException
		{
			Test obj = new Test();
			obj.run();
			obj.start();
		}
	}



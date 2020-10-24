package basicconcepts.com.threads;

class MyThread implements Runnable 
{
	public void run()
	{
		try {
			System.out.println("Thread : "+Thread.currentThread().getId()+" is running.");
		}
		catch(Exception e)
		{
			e.getLocalizedMessage();
		}
	}
}

public class ThreadWithException {

	public static void main(String[] args) {

		for(int i=0;i<5;i++)
		{
			Thread t1 = new Thread(new MyThread());
			t1.start();
		}
	}

}

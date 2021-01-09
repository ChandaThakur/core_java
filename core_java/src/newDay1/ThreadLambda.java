package newDay1;

public class ThreadLambda {
	
	Runnable r1=new Runnable()
	{
public void run() {
	System.out.println("thread is running");
}

	};
	Thread t1=new Thread(r1);
	t1.start();
	
	Runnable r2=()->System.out.println("thread 2 is running");
	Thread t2=new Thread(r2);
	t2.start();

}

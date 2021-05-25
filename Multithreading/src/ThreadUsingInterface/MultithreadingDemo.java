package ThreadUsingInterface;

public class MultithreadingDemo implements Runnable{

	public void run()
    {
        try {
            
            System.out.println("Thread " + Thread.currentThread().getId()+ ", "+Thread.currentThread().getName()+" is running");
            //System.out.println("Thread " + Thread.currentThread().getName());
        }
        catch (Exception e) {
           
            System.out.println("Exception is caught");
        }
    }
}

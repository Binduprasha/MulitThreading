package ThreadUsingInterface;

public class TestMultithread {
	public static void main(String[] args)
    {
		
		Thread mainThread=Thread.currentThread();
		System.out.println("Main Thread Id :"+mainThread.getId());
		System.out.println("Main Thread Name :"+mainThread.getName());
		System.out.println("Main Thread Priority :"+mainThread.getPriority());
		
		System.out.println();
        int n = 3; 
        for (int i = 0; i < n; i++) {
        	
            Thread object= new Thread(new MultithreadingDemo());
            object.start();
        }
    }

}

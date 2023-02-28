package fibonacci;

public class Recursive extends Thread {
	public static int fib(int n){
		//using code given in example of COP 2805
		if(n == 0) return 0;
		if(n == 1) return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	public void run(){
		//capture time from start to finish of fibonacci number
		long time = System.nanoTime();
		
		//change number for Iterative and Recursive to place on my x y axis chart
		fib(45);
		
		// Set time for milliseconds
		time = System.nanoTime() - time;
		
		// print result
		System.out.println("Using recursive programing" + " \n It took " + time + " nanotime to complete.\n");
	}
}

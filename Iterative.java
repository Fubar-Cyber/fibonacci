package fibonacci;

public class Iterative extends Thread {
	public static int fib(int n){
		//using code given in example of COP2805
		int v1 = 0, v2 = 1, v3 = 0;
		for(int i=2 ; i <= n; i++){
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}
		return v3;
	}
	public void run(){
		//capture time from start to finish of ?th fibonacci number
		long time = System.nanoTime();
		
		//change number for Iterative and Recursive to place on my x y axis chart
		fib(45);
		
		// Set time for milliseconds
		time = System.nanoTime() - time;
		
		// print result
		System.out.println("Fibonacci number is: " + fib(45) + "\n Using iterative programing:" + " \n It took " + time + " nanotime to complete.\n");
	}
}

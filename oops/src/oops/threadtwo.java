package oops;

public class threadtwo extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 7; i++) {
			System.out.println("\nthis is from threadtwo"  + i);

		}
	}
 }
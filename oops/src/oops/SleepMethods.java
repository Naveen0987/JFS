  package oops;

public class SleepMethods {

	public static void main(String[] args) throws InterruptedException {
		naveen na=new naveen();
		na.start();
		
		amma a=new amma();
		Thread t2=new Thread(a);
		t2.start();

	}

}
class naveen extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
			Thread.sleep(1001);
			System.out.println("hello");
			}
			catch(InterruptedException e) {
				System.out.println("exception accured");

			}
		}
	}
}
class amma implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
				Thread.sleep(1000);
				Thread.yield(); 
				System.out.println("hi");
				}
				catch(InterruptedException e) {
					System.out.println("exception accured");

				}
		}
	}
}
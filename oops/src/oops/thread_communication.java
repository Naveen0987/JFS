package oops;

public class thread_communication {

	public static void main(String[] args)throws InterruptedException {
		surya s=new surya();
		s.start();
		
		synchronized(s) {
			s.wait();

			System.out.println("sum is "+s.num);

		}

	}

}
class surya extends  Thread{
	int num;
	@Override
	public void run() {

		synchronized(this) {
			for(int i=1;i<5;i++) {
				num+=i;
			}
			this.notify();

	}
	}
	
}
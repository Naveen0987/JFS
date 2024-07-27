package oops;

public class threadone {
	public static void main(String[] args) {
		threadtwo t2 = new threadtwo();

		t2.start();
		
		threadthree tr3=new threadthree();
		Thread t3=new Thread(tr3);
		t3.start();
		

		for (int i = 1; i <= 5; i++) {
			System.out.println("hi im from threadone" + i);
		}
	}
}


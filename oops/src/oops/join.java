package oops;

public class join {
	public static void main(String[] args) throws InterruptedException {

		rama2 one = new rama2();

		rama1 raw1 = new rama1();
		raw1.one = one;
		raw1.start();

		one.start();
		rama3 raw3 = new rama3();

		raw3.start();

		

		raw3.join();
raw1.join();

		System.out.println("rama happy");
	}
}

class rama1 extends Thread {
	rama2 one;

	public void run() {
		try {
			one.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("rama come to home");
	}
}

class rama2 extends Thread {
	public void run() {
		System.out.println("rama in forests");
	}
}

class rama3 extends Thread {

	public void run() {

		System.out.println("rama leaving home");
	}
}

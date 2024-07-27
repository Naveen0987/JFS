package oops;

public class multi {
	public static void main(String[] args) {

		one o = new one();
		o.start();

		two t = new two();
		Thread t2 = new Thread(t);
		t2.start();

		three tt = new three();
		Thread t3 = new Thread(tt);
		t3.start();

		System.out.println("im from main method ");

	}
}

class one extends Thread {
	public void run() {

		for (int i = 1; i < 3; i++) {
			System.out.println("this is from first thread" + i);

		}
	}

}

class two implements Runnable {

	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println("this is from second thread" + i);

		}
	}
}

class three implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++) {

			System.out.println("this is from third thread" + i);

		}
	}

}

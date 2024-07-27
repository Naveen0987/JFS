package oops;

public class synchronization {
public static void main(String[] args) throws InterruptedException{
	Aero a=new Aero();
	
	b B=new b();
B.aero=a;

c C=new c();
C.zero=a;
C.start();
B.start();
}
}

class b extends Thread{
	Aero aero;
	public void run() {
		
		
		
	aero.aero(3, "im from class b");
		
	}
}
class c extends Thread{
	Aero zero;
	public void run() {
			zero.aero(5,"im from c");

	}
}
class Aero extends Thread{
	synchronized void aero(int num , String name) {
		for(int i=1;i<=num;i++) {
		System.out.println(name + "***"+ i);
	}
	}
	}


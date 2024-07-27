package oops;

public class Wrapper {

	public static void main(String[] args) {

		// Primitive data types

		byte by = -127;
		int a = 20;
		double b = 89;
		float c = 88.1f;
		String d = "7777";
		short sh = 56;
		boolean boo = false;
		long l = 888;
		char ch = '8';

		// Wrapper Classes (Objects)

		Byte byy = by;
		Integer in = a;
		Integer s = Integer.valueOf(d);
		Double bb = b;
		Float ff = c;
		Short shh = sh;
		Boolean bool = boo;
		Long ll = l;
		Character chh = ch;

		System.out.println(byy);
		System.out.println(s);
		System.out.println(in);
		System.out.println(s);
		System.out.println(bb);
		System.out.println(ff);
		System.out.println(shh);
		System.out.println(bool);
		System.out.println(ll);
		System.out.println(chh);

	}

}

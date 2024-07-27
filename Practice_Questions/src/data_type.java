import java.util.Scanner;

public class data_type {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = "8465";
		

			int b = Integer.parseInt(a);
			System.out.println(b);
		

		System.out.println("Enter num :");
		
			String useri = sc.nextLine();
			int out = Integer.parseInt(useri);
			System.out.println("This is the output after String convert into integer :" + out);
		

		byte ass = 5;
		
			double as = (double) ass;
			System.out.println("this is the output after convert byte into double :" + as);

		

		System.out.println("Enter first float number :");
		
			float num1 = sc.nextFloat();
			System.out.println("Enter second float number :");
			float num2 = sc.nextFloat();
			int convert = (int) (num1 / num2);

			System.out
					.println("this is the output after 2 float numer divided then converted into integer :" + convert);

		

		System.out.println("enter number");
		String input = sc.next();
		try {

			int output = Integer.parseInt(input);
			System.out.println("this is the output after convertion :" + output);
		} catch (NumberFormatException e) {
			System.out.println("the formoat you entered is not good please enter again in correct form");
		}finally {
			sc.close();
		}
		
	}
}


import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		//take 2 num as user input and print their sum,difference,product,quotient
		System.out.println("take 2 num as user input and print their sum,difference,product,quotient\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int FirstNum = sc.nextInt();
		System.out.println("Enter second number");
		int SecondNum = sc.nextInt();

		int result = FirstNum + SecondNum;
		System.out.println("Sum of two numbers :" + result);

		int difference = FirstNum - SecondNum;
		System.out.println("This is the difference between two numbers :" + difference);

		double product = FirstNum * SecondNum;
		System.out.println("This is the product of two numbers :" + product);

		float quotient = FirstNum / SecondNum;
		System.out.println("This is the quotient of two numbers :" + quotient);
		
		
		//check if two numbers are equal by using "==" operator
		
		System.out.println("\ncheck if two numbers are equal by using '==' operator \n");
		
	 if(FirstNum==SecondNum) {
		 System.out.println("equal");
	 }
	 else {
		 System.out.println("not equal");
	 }
	  
	 
	 //create a program that uses the logical AND and OR operators to evaluate two conditions

	 System.out.println("\ncreate a program that uses the logical AND and OR operators to evaluate two conditions\n"
	 		+ "");
	 
	 int age=18;
	 boolean a=true;
	 if(age>=18 && a){
		 System.out.println("eligible");
	 }
	 else {
		 System.out.println("not eligible");
	 }
	 
	 //int age=18;
		
	}

}


public class stringreverseoptimization {
	public static void main(String[] args) {
		String name = "Naveen";
		StringBuilder na = new StringBuilder(name); // thi is the string builder in string
		String name2 = name.concat(" Ch"); // concat used to add 2 strings
		na.append('k');
		System.out.println(na);
		System.out.println(name2);
		System.out.println(na.reverse());
		System.out.println(na.reverse()); // special method in string to reverse String

		char[] namearray = name.toCharArray(); // used to convert string into array
		int start = 0; // take empty var to story reversed chars
		int end = namearray.length - 1; // arrays traverse from -1 so take this for loop from end to start

		while (start <= end) { // condition

			char temp = namearray[start]; // temp char var to use swap array and store first char into temp
			namearray[start] = namearray[end]; // swap first char to last position
			namearray[end] = temp; // swap last char into temp var
			start++; // update start index to move forword
			end--; // update index to move from last to first

		}
		for (int i = 0; i < namearray.length; i++) { // loop for show the loop and print (optional)
			System.out.println(namearray[i]);

		}
		System.out.println(namearray); // printing reversed string

	}

}

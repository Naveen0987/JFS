import java.util.Arrays; //array package

public class bubblesort {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		System.out.println("\narray before sorting");

		ArrayMethod(arr); // printing array before sorting

		int counter = 0; // to know how many time loop created
		for (int i = 0; i < arr.length - 1; i++) { // outer loop
			boolean isswapping = false; // boolean for checking array is sorted or not
			for (int n = 0; n < arr.length - 1-i; n++) { // inner loop
				counter++;
				if (arr[n] > arr[n + 1]) { // condition for checking array numbers
					int swap = arr[n]; // tem var for storing tem result
					arr[n] = arr[n + 1];
					arr[n + 1] = swap;
					isswapping = true; // if boolean is true then it means loop happening it is not sorted

				}

			}

			if (!isswapping) { // if boolean false it means loop didnt start and no need to loop it is already
								// sorted
				System.out.println("swapped");
				break;
			}
		}
		System.out.println("Counter " + counter); // to know how many times loop happening
		System.out.println("\n \n" + Arrays.toString(arr) + "\n"); // this is special statement to print array
		System.out.println("array after sorting");
		ArrayMethod(arr); // printing array after sorted
	}

	static void ArrayMethod(int[] arr) { // this is method for printing multiple times (optional)
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");

		}

	}

}

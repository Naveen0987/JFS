
public class binary {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int start = 0; // array index start from 0
		int end = arr.length - 1; // array length always traverse from -1
		int target = 40;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				System.out.println("element found at index position : " + mid);
				break;

			} else if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;

			}
		}
	}
}

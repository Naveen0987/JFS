public class Stringreverse {
	public static void main(String[] args) {
		String name = "naveen";
		char[] namearray = name.toCharArray();
		int arrayreverse = namearray.length - 1;
		char[] reverse = new char[namearray.length];
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = namearray[arrayreverse];
			arrayreverse--;
		}

		System.out.println(reverse);

	}
}
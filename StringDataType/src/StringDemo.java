
public class StringDemo {

	public static void main(String[] args) {
		//stringoperations();
		
		
		String name6="hi im naveen";
		String [] split=name6.split(" ");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);

		
		}
		

		

	}

	/*private static void stringoperations() {
		String name1 = "Naveen";
		String name2 = "NAVEEN";
		String name3 = new String("Naveen");
		String name4 = new String("NaVeEn");

		char[] characters = { 'n', 'a', 'v', 'e', 'e', 'n' };
		String name5 = new String(characters);

		String lowercase = name2.toLowerCase();
		String uppercase = name1.toUpperCase();

		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name2.equals(name3));
		System.out.println(name2.equalsIgnoreCase(name3));
		System.out.println(name3.equalsIgnoreCase(name4));
		System.out.println(lowercase);
		System.out.println(uppercase);
		System.out.println(name1.charAt(5));
		System.out.println(name1.indexOf('e'));
		System.out.println(name1.substring(0, 3));
		System.out.println(name5);
	}
	*/

}

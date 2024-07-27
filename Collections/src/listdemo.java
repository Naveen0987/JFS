import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class listdemo {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("hi");
		arr.add(0, "orey");
		arr.add(55);
		arr.add(88.6f);
		arr.add(-127);
		arr.add('h');
		arr.add(48785455);

		System.out.println("ArrayList :" + arr);

		Set a = new HashSet();
		a.add("hi");
		a.add("orey");
		a.add(55);
		a.add(88.6f);
		a.add(-127);
		a.add('h');
		a.add(48785455);
		a.add(-127);
		a.add("orey");

		System.out.println("set :" + a);

		LinkedList convert1 = new LinkedList(arr); // converted arraylist into linkedlist
		LinkedList convert2 = new LinkedList(a); // converted set into linkedlist

		ArrayList convert3 = new ArrayList(convert1);
		Set convert4 = new HashSet(convert1);

		System.out.println("Arraylist converted into Linkedlist :" + convert1);
		System.out.println("Set converted into LinkedList :" + convert2);
		System.out.println("LinkedList converted into ArrayList :" + convert3);
		System.out.println("LinkedList converted into Set :" + convert4);
	}

}

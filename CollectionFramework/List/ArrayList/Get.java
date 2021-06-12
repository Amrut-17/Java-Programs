import java.util.*;

class Get{
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Bob");
		li.add("Alice");
		li.add("Joe");
		li.add("John");

		System.out.println(li);

		// GET element from list :
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
		System.out.println(li.get(3));
	}
}
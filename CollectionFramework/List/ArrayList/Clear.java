import java.util.*;
class Clear{
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(70);
		arr.add(80);
		System.out.println(arr);

		// REMOVE OR CLEAR ENTIRE ARRAYLIST

		arr.clear();
		System.out.println(arr);
	}
}
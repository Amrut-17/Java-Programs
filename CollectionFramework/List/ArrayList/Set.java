import java.util.*;

/*
	unlike add and remove function SET  work on O(1) time complexity
*/
class Set{
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

		// If we need to update an element in the array :
		arr.set(2, 30000000);
		System.out.println(arr);
	}
}
import java.util.*;

/*
	TC = O(n)
*/

class Contains{
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

		// TO check whether element is present in the list or not 

		// if present then returns TRue else return false 

		System.out.println(arr.contains(20));
		System.out.println(arr.contains(20000000));
	}
}
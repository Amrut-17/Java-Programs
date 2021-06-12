import java.util.*;

/* 
	IMPORTANT 	:
		If we remove element in list then all elements present right side of that element 
		will shift left ---> TIME COMPLEXITY of remove function : " O(n) " n = size of list 
*/
class Remove{
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

		// REMOVE ELEMENT :
		System.out.println(arr.remove(2)); // here we need to pass index of the perticular element
		System.out.println(arr);

		// remove specific element directly :
		System.out.println(arr.remove(Integer.valueOf(70)));
		System.out.println(arr);
	}
}
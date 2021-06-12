import java.util.*;
/* 
	IMPORTANT 	:
		If we add element in list then all elements present right side of that element
		will shift RIGHT ---> TIME COMPLEXITY of add function : " O(n) " n = size of list 
*/
class One{
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(); // DECLARATION OF ARRAY 
		arr.add(10); // add element to end of the list 
		arr.add(20);
		arr.add(30);
		arr.add(50);
		System.out.println(arr);

		// add element to specific index 
		arr.add(3, 40); // here 1st argument is index and 2nd is value. 0 indexing **
		System.out.println(arr);

		// add anoter different list to previous list
		List<Integer> newList = new ArrayList<>();
		newList.add(60);
		newList.add(70);
		newList.add(80);
		System.out.println(newList);

		arr.addAll(newList); // new list added to current list
		System.out.println(arr);

		
	}
}
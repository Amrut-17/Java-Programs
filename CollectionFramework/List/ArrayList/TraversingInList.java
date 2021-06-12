import java.util.*;
class TraversingInList{
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Bob");
		li.add("Alice");
		li.add("John");
		li.add("Joe");
		li.add("Alison");
		li.add("Maaria");
		System.out.println(li);

		// mTRAVERSING IN LIST WITH for-loop

		for(int i=0; i<li.size(); i++){
			System.out.println("Element at Index " + i + " --> " + li.get(i));
		}


		// TRAVERSING IN LIST WITH for-each-loop
		for(String str: li){
			System.out.println("-- " + str );
		}

		// TRAVERSING IN LIST WITH Iterator :
		Iterator<String> iter = li.iterator();
		while(iter.hasNext()){
			System.out.println("--> " + iter.next());
		}

	}
}
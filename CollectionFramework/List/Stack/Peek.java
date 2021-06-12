import java.util.*;

class Peek{
	public static void main(String[] args) {
		Stack<String> sports = new Stack<>();
		sports.push("Cricket");
		sports.push("Football");
		sports.push("Baseball");
		sports.push("Basketball");
		sports.push("Softball");
		sports.push("Hockey");

		System.out.println(sports);

		String elem = sports.peek(); // returns peek element in stack LIFO
		System.out.println("Peek Element : " + elem ); 
	}
}
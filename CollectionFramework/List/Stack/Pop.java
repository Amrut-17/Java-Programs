import java.util.*;

class Pop{
	public static void main(String[] args) {
		Stack<String> sports = new Stack<>();
		sports.push("Cricket");
		sports.push("Football");
		sports.push("Baseball");
		sports.push("Basketball");
		sports.push("Softball");
		sports.push("Hockey");

		System.out.println(sports);

		String elem = sports.pop(); // removes the last element in stack // LIFO --> Last In First Out 
		System.out.println(" Element : " + elem );

		System.out.println("Stack : " + sports);
	}
}
// import java.util.Stack; // --> Dedicated package 
import java.util.*;

class Push{
	public static void main(String[] args) {
		Stack<String> sports = new Stack<>();
		sports.push("Cricket");
		sports.push("Football");
		sports.push("Baseball");
		sports.push("Basketball");
		sports.push("Softball");
		sports.push("Hockey");
		System.out.println(sports);
	}
}
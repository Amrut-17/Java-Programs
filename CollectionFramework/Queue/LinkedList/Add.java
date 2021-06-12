import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Add{
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); // Declaration of Queue


		/* add and offer function are similar add will simply add the value in queue and if the value is not added in the queue 
		then it will throw an exception on the other hand offer function just return true or false */ 
		q.add(10); 
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		System.out.println("Queue : " + q);


	}
}
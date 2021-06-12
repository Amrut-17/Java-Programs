import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Remove{
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); // Declaration of Queue

		try{
			System.out.println("Exception : " + q.remove());
		}catch(Exception e){
			System.out.println(e);
		}
		/* Removefunction will return head of the queue. But if queue is empty then it will throw Exception */ 
		q.add(10); 
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		System.out.println("Queue : " + q);

		System.out.println("When queue is NOT empty : " + q.remove());
		System.out.println("After Remove : " + q);

	}
}
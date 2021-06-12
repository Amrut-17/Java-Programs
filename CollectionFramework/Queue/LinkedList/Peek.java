import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

/* if queue is empty then it'll return 'null' comparable to element function ** */

class Peek{
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); // Declaration of Queue

		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
		q.offer(70);
		q.offer(80);
		System.out.println("Qoeoe : " + q);

		// PEEK returns element which will be pop next :
		System.out.println("Element  : " + q.peek());
	}
}
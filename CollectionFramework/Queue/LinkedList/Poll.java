import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
/* if queue is empty it'll return ' null ' */
class Poll{
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

		System.out.println("Element Polled : " + q.poll());
		System.out.println("After Poll : " + q);
	}
}
package dsa;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		
		System.out.println("enque the elements..");
		
		q.offer(45);
		q.offer(74);
		q.offer(19);
		q.offer(37);
		q.offer(90);
		
		System.out.println("peek the element :"+q.peek());
		System.out.println("remove the element :"+q.poll());
		System.out.println("peek the element :"+q.peek());
		System.out.println("size of the element :"+q.size());
		System.out.println("check is empty :"+q.isEmpty());
		

	}

}

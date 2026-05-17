package dsa;
import java.util.Stack;
public class QueueWithStacks {
	//create two stacks

	Stack<Integer> input = new Stack();
	Stack<Integer> output = new Stack();
	
	//inaerting the data
	
	public void enqueue(int value) {
		input.push(value);
	}
	//peek operation
	public int peek() {
		if(output.isEmpty()) {
			while(!input.isEmpty()) {
				output.push(input.pop());
			}
		}
		return output.peek();
	}
	//removing element
	public int dequeue() {
		peek();
		return output.pop();
	}
	//empty condition
	public boolean isEmpty() {
		return input.empty() && output.empty();
	}
	
	
	public static void main(String[] args) {
		QueueWithStacks q = new QueueWithStacks();
		q.enqueue(56);
		q.enqueue(72);
		q.enqueue(96);
		q.enqueue(51);
		
		System.out.println("peek the element: "+q.peek());
		System.out.println("pop the element: "+q.dequeue());
		System.out.println("peek the element: "+q.peek());
		

	}

}

	
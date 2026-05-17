package dsa;

import java.util.Stack;
import java.util.Arrays;

public class StackOperations {
	
	//create two stacks
	Stack<Integer> stack = new Stack();
	Stack<Integer> minstack = new Stack();
	
	public void pushing(int val) {
		stack.push(val);//insert into min stack
		if(minstack.isEmpty() || val<=minstack.peek()) {
			minstack.push(val);
		}
	}
	//poping operation
	public void popping() {
		
		if(stack.peek().equals(minstack.peek())) {
			
			minstack.pop();
		}
		stack.pop();
		}
	//peek operation
	public int topEle()
	{
		return stack.peek();
	}
	//getting minimum element
	public int getMin() {
		return minstack.peek();
	}
	public static void main(String[] args) {
		StackOperations getmin = new StackOperations();
		
		getmin.pushing(5);
		getmin.pushing(-3);
		getmin.pushing(0);
		getmin.pushing(-2);
		getmin.pushing(4);
		
		System.out.println("top element : "+getmin.topEle());
		System.out.println("top element : "+getmin.getMin());
		getmin.popping();

		System.out.println("top element : "+getmin.topEle());
		System.out.println("top element : "+getmin.getMin());
		
		
		
		

	}

}

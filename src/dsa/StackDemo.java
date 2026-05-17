package dsa;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.add(67);
		st.push(56);
		st.push(34);
		st.push(12);
		st.push(48);
		st.push(78);
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search(34));
		System.out.println(st.isEmpty());
		st.pop();
		System.out.println(st.peek());

	}

}

package dsa;

public class QueueLinkedList {
	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
			this.next = null;
		}
	}
	class Queue{
		Node head;
		Node tail;
		int size;
		
		//is empty
		public boolean isEmpty()
		{
			return head == null;
		}
		// size of queue
		public int size() {
			return size;
		}
		//insert operation
		public void enqueue(int value) {
			Node newNode = new Node(value);
			if(tail==null) {
				head = tail = newNode;
				
			}else {
			tail.next = newNode;
			tail = newNode;
			}
			size++;
			
		}
		
			
		//Dequeue operation
		public int dequeue() {
			if(head == null) {
				throw new RuntimeException("Queue is Empty");
			}
			int number =head.val;//value read
			head = head.next;
			if(head == null ) {
				tail = null;
			}
			size --;
			return number;
		}
		//select the element
		public int peek() {
			return head.val;
		}
		
	}

	public static void main(String[] args) {
		QueueLinkedList outer = new QueueLinkedList();
        Queue obj = outer.new Queue();
        
		System.out.println("enque the elements");

		obj.enqueue(56);
		obj.enqueue(76);
		obj.enqueue(23);
		obj.enqueue(86);
		obj.enqueue(51);
		obj.enqueue(94);
		
		System.out.println("first element to retrive ;"+obj.peek());
		System.out.println("size of the queue: "+obj.size());
		System.out.println("pop the element :"+obj.dequeue());
		System.out.println("pop the element :"+obj.dequeue());
		System.out.println("pekking  the element :"+obj.peek());
		System.out.println("curent size :"+obj.size());
		System.out.println("is queue empty :"+obj.isEmpty());
		
		
	}

}

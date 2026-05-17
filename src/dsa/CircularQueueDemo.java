package dsa;

public class CircularQueueDemo {
	int []data;
	int front ;
	int rare;
	int capacity;
	int size;
	public CircularQueueDemo(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
		front = 0;
		rare = 0;
		this.size = 0;
		
	}
	//queue is empty
	public boolean isEmpty() {
		return size == 0;
	}
	//queue is full
	public boolean isFull()
	{
		return size == capacity;
	}
	//enqueue operation
	public void enqueue(int val) {
		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		data[rare] = val;
		rare = (rare+ 1)%capacity;
		size++;
	}
	//dequeue operation
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int removed = data[front];
		front = (front+1)%capacity;
		size--;
		return removed;
	}
	//peek operation
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return data[front];
	}
	//display operation
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for (int i = 0;i<size;i++) {
			System.out.println(data[(front+i)%capacity]+" ");
		}
	}
	//internal operations
	public void internalOp()
	{
		System.out.println("display the array");
		for (int vals:data) {
			System.out.println(vals+" ");
		}
		System.out.println();
		System.out.println("--------");
		System.out.println("rear "+rare);
		System.out.println("front "+front);
		System.out.println("size "+size);
		System.out.println("---------");
		
	}

	public static void main(String[] args) {
		CircularQueueDemo cq = new CircularQueueDemo(5);
		cq.enqueue(56);
		cq.enqueue(64);
		cq.enqueue(72);
		cq.enqueue(96);
		
		cq.display();
		cq.internalOp();
		
		cq.dequeue();
		cq.dequeue();
		
		cq.display();
		cq.internalOp();
		
		cq.enqueue(18);
		cq.display();
		cq.internalOp();
		
	}

}

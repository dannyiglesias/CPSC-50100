import java.util.Queue;

public class queueArray{
	private char Queue1[];
	private int front;
	private int rear;
	private int size;
	
	public queueArray() {
		size = 10;
		front = -1;
		rear = -1;
		Queue1 = new char[size];
	}

	public void enqueue(char c) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			Queue1[rear] = c;
		} 
		else if (rear + 1 >= size)
			System.out.println("Queue is full");
		else if (rear + 1 < size)
			Queue1[++rear] = c;
		}
	
	public char dequeue() {
		if (qEmpty())
			throw new RuntimeException("Queue Underflow");
		else {
			char c = Queue1[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				front++;
			}

			return c;

		}

	}

	// Check if queue is empty
	

	public boolean qEmpty() {
		return front == -1;
	}
}

			

import java.util.Queue;

public class queueTest extends queueArray {
	public static void main(String str[]) {
		queueArray queue = new queueArray();
		
		System.out.println("Adding char : a");
		queue.enqueue('a');
		
		System.out.println("Adding char : b");
		queue.enqueue('b');
		
		System.out.println("Adding char : c");
		queue.enqueue('c');
		
		System.out.println("Adding char : d");
		queue.enqueue('d');
		
		System.out.println("Removed char : " + queue.dequeue());
		System.out.println("Removed char : " + queue.dequeue());
		System.out.println("Removed char : " + queue.dequeue());
	}

}




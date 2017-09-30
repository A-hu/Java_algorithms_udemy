package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(23);
		myQueue.insert(234);
		myQueue.insert(2345);
		myQueue.insert(23456);
		myQueue.insert(234567);
		myQueue.insert(2345678);
		myQueue.insert(23456789);
		
		
		myQueue.view();

	}

}

package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(200);
		myList.insertFirst(300);
		myList.insertFirst(400);
		myList.insertFirst(500);
		myList.insertLast(999);
		
		myList.displayList();

	}

}

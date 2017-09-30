package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(200);
		myList.insertFirst(300);
		myList.insertFirst(400);
		myList.insertFirst(500);
		myList.insertLast(999);
		
		myList.displayList();

	}

}

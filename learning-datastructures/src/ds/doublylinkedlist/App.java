package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(11);
		theList.insertFirst(22);
		theList.insertFirst(33);
		theList.insertLast(99);
		theList.insertLast(88);
		theList.insertLast(77);
		theList.displayForward();
		theList.displayBackward();
		theList.deleteFirst();
		theList.deleteLast();
		theList.deleteKey(11);
		theList.displayForward();
		theList.insertAfter(99, 99999);
		theList.insertAfter(88, 88888);
		theList.displayForward();
	}

}

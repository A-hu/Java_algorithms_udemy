package linkedlists;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;

		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(listLength(nodeA)); // 4
		System.out.println(listLength(nodeB)); // 3
		System.out.println(listLength(nodeD)); // 3
	}
	
	public static int listLength(Node aNode) {
		int count = 1;
		while(aNode.next != null) {
			count++;
			aNode = aNode.next;
		}
		
		return count;
	}

}
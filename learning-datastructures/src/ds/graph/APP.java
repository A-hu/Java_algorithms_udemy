package ds.graph;

public class APP {

	public static void main(String[] args) {
		Graph myGraph = new Graph(5);
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,2);
		myGraph.addEdge(0,3);
		myGraph.addEdge(1,2);
		myGraph.addEdge(1,4);
		myGraph.addEdge(2,3);
		myGraph.addEdge(3,1);
		myGraph.addEdge(4,0);
		myGraph.addEdge(4,3);

		Object [] values = myGraph.adj(0);
		for(Object val : values) {
			System.out.println(val);
		}
		
		BetterGraph myBetterGraph = new BetterGraph(5, "directed");
		myBetterGraph.addVertex("Hi");
		myBetterGraph.addVertex("HHi");
		myBetterGraph.addVertex("HHHi");
		myBetterGraph.addVertex("HHHHi");
		myBetterGraph.addVertex("HHHHHi");
		
		myBetterGraph.addEdge("Hi", "HHi");
		myBetterGraph.addEdge("Hi", "HHHi");
		myBetterGraph.addEdge("Hi", "HHHHi");
		myBetterGraph.addEdge("HHi", "HHHi");
		myBetterGraph.addEdge("HHHi", "Hi");
		myBetterGraph.addEdge("HHHi", "HHHHi");
		myBetterGraph.addEdge("HHHHHi", "Hi");
		myBetterGraph.addEdge("HHHHHi", "HHHi");
		
		myBetterGraph.print();
	}

}

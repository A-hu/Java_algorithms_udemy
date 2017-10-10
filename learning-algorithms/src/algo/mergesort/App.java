package algo.mergesort;

public class App {

	public static void main(String[] args) {
		int [] inputArray = {2,3,1,4,5,2,3,4,5,7,6,5,42,3,2};
		MergeSort sorter = new MergeSort();
		
		sorter.sort(inputArray);
		
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

}

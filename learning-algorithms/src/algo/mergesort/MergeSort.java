package algo.mergesort;

public class MergeSort {
	public static void sort(int inputArray[]) {
		sort(inputArray, 0, inputArray.length - 1);
	}

	private static void sort(int[] inputArray, int start, int end) {
		if(end <= start) return; // we're done traversing the array
		
		int mid = (start + end)/2;
		sort(inputArray, start, mid); // sort left half
		sort(inputArray, mid + 1, end); // sort right half
		merge(inputArray, start, mid, end); // merge sorted results input the inputArray
	}

	private static void merge(int[] inputArray, int start, int mid, int end) {
		int[] tempArray = new int [end - start + 1];
		
		// index counter for the left and right side of the array
		int leftSlot = start;
		int rightSlot = mid+1;
		int i = 0;
		
		while(leftSlot <= mid && rightSlot <= end) {
			if(inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[i] = inputArray[leftSlot];
				leftSlot++;
			}else {
				tempArray[i] = inputArray[rightSlot];
				rightSlot++;
			}
			i++;
		}
		
		// When it get's to here, that means the above loop has completed.
		// So both the right and the left side of the sub=array can be considered sorted
			
		if(leftSlot <= mid) {
			while(leftSlot <= mid) {
				tempArray[i] = inputArray[leftSlot];
				i++; 
				leftSlot++;
			}
		}else if(rightSlot <= end){
			while(rightSlot <= end) {
				tempArray[i] = inputArray[rightSlot];
				i++; 
				rightSlot++;
			}
		}
		
		// copy over the temp array into the appropriate slots of the inputArray
		for(int j = 0; j < tempArray.length; j++) {
			inputArray[start+j] = tempArray[j];
		}
	}

}

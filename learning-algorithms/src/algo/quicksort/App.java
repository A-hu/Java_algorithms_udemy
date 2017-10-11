package algo.quicksort;

import java.util.Arrays;

import algo.mergesort.MergeSort;

public class App {

	public static void main(String[] args) {
		int [] inputArray = {2,3,1,4,5,2,3,4,5,7,6,5,42,3,2};
		quickSort(inputArray, 0, inputArray.length-1);
		
		System.out.println(Arrays.toString(inputArray));

	}
	
	public static void quickSort(int [] inputArray, int start, int end) {
		if(start < end) {
			int pp = partition(inputArray, start, end); // index position of the correctly placed value in the array
			quickSort(inputArray, start, pp-1); // sorts the left half of the range
			quickSort(inputArray, pp+1, end); // sorts the right half of the range
		}
	}
	
	public static int partition(int [] inputArray, int start, int end) {
		
		int pivot = inputArray[end];
		
		int i = start -1; // in the first iteration, i starts from -1
		
		for(int j = start; j <= end-1; j++) {
			if(inputArray[j] < pivot) {
				i++;
				int ival = inputArray[i];
				int jval = inputArray[j];
				
				// swapping below
				inputArray[i] = jval;
				inputArray[j] = ival;
			}
		}
		
		// put the pivot value in the correct slat next
		int ival = inputArray[i+1];
		inputArray[end] = ival;
		inputArray[i+1] = pivot; // here, pivot value is placed in the correct slaot of the array
		
		return i+1;
		
	}

}

package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int [] myArray = selectionSort(new int[] {2,3,1,4,5,2,3,4,5,7,6,5,42,3,2});
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	
	public static int [] selectionSort(int a[]) {
//		int i = 0;
//		int k = 0;
//		while(i < a.length) {
//			int min = a[i];
//			int j = i + 1;
//			while(j < a.length) {
//				if(a[j] < min) {
//					min = a[j];
//					k = j; 
//				}
//				j++;
//			}
//			a[k] = a[i];
//			a[i] = min;
//			i++;
//		}
		for(int i=0; i < a.length; i++) {
			int minimum = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[minimum]) { // if we find a smaller value
					minimum = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		
		return a;
	}

}

package algo.recursion;

public class App {

	public static void main(String[] args) {
		System.out.println("Basic recursion");
		reduceByOne(10);
		
		System.out.println("Linear recursion");
		System.out.println(recursiveLinearSearch(new int [] {1,2,3,4,5,6,7,8,9,10,11,12}, 0, 7));
		
		System.out.println("Binary recursion");
		System.out.println(recursiveBinarySearch(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13}, 0, 12, 3));
		System.out.println(recursiveBinarySearch(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13}, 0, 12, 14));
	}
	
	public static void reduceByOne(int n) {
		if(n > 0) reduceByOne(n-1);
		System.out.println("completed Call: " + n);
	}
	
	public static int recursiveLinearSearch(int [] a, int i, int x) {
		if(i > a.length - 1) { // if evaluates to true, x was not found in the array
			return -1;
		}else {
			if(a[i] == x) {
				return i;
			}else {
				System.out.println("index at " + i);
				return recursiveLinearSearch(a, i + 1, x);
			}
		}
	}
	
	public static int recursiveBinarySearch(int [] a, int p, int r, int x) {
		System.out.println("[ " + p + "..." + r + " ]");
		if(p > r) {
			return -1;
		}else {
			int q = (p+r)/2;
			if(a[q] == x) {
				return q;
			}else if(a[q] < x) {
				return recursiveBinarySearch(a, q+1, r, x);
			}else {
				return recursiveBinarySearch(a, p, q-1, x);
			}
		}
	}
}

//completed Call: 0
//completed Call: 1
//completed Call: 2
//completed Call: 3
//completed Call: 4
//completed Call: 5
//completed Call: 6
//completed Call: 7
//completed Call: 8
//completed Call: 9
//completed Call: 10
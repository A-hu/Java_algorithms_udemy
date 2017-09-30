package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(9);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(100);
		theStack.push(100);
		theStack.push(100);
		theStack.push(100);
		theStack.push(100);
		theStack.push(100);
		theStack.push(110);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		
		System.out.println(ReverseWord("hello world"));
	}
	
	public static String ReverseWord(String str) {
		int stringSize = str.length();
		Reverse theString = new Reverse(stringSize);
		
		for(int i = 0; i < stringSize; i++) {
			char ch = str.charAt(i);
			theString.push(ch);
		}
		
		String result = "";
		while(!theString.isEmpty()) {
			char ch = theString.pop();
			result += ch;
		}
		
		return result;
	}
	
}

package ds.stack;

public class Reverse {
	
	private char[] chararray;
	private int top;
	
	public Reverse(int arrSize) {
		this.chararray = new char[arrSize];
		this.top = -1;
	}
	
	public void push(char i) {
		top++;
		chararray[top] = i;
	}
	
	public char pop( ) {
		int old_top = top;
		top--;
		return chararray[old_top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
}

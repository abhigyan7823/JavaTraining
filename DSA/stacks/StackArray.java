package src.stacks;

public class StackArray {
	final int max = 100;
	int top = -1 ;
	int[] arr = new int[max];
	
	Boolean isEmpty() {
		return top < 0 ;
	}
	
	Boolean push(int data) {
		if(top >= max-1) {
			System.out.println("Stack OverFlow");
			return false;
		}
		else {
			arr[++top] = data;
			return true;
		}
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("Empty");
			return 0;
		}
		else {
			return arr[top];
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Empty");
			return 0;
		}
		else {
			return arr[top--];
		}
	}
	
	public static void main(String[] args) {
		StackArray st = new StackArray();
		System.out.println(st.isEmpty());
		st.push(2);
		System.out.println(st.isEmpty());
		st.push(3);
		st.push(9);
		st.push(4);
		st.push(1);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}

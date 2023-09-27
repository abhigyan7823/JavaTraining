package src.stacks;
import java.util.ArrayList;

public class StackAl {
	ArrayList<Integer> al = new ArrayList<Integer>();
	boolean isEmpty() {
		return al.size()==0;
	}
	
	public void push(int data) {
		al.add(data);
	}
	
	public int peek() {
		if(al.size()==0) {
			System.out.println("Empty");
			return -1;
		}
		return al.get(al.size()-1);
	}
	
	public int pop() {
		if(al.isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		int a = al.get(al.size()-1);
		al.remove(al.size()-1);
		return a;
	}
	
	public static void main(String[] args) {
		StackAl st = new StackAl();
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

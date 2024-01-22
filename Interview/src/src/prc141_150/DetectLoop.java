package src.prc141_150;

import src.prc131_140.LinkedList;
import src.prc131_140.LinkedList.Node;

public class DetectLoop {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(5);
		ll.insert(6);
//		ll.head.next.next.next.next.next = ll.head;
		int flag = 0;
		Node slow = ll.head;
		Node fast = ll.head.next;
		while(fast!=null && fast.next != null) {
			if(slow == fast) {
				flag++;
				System.out.println("Loop Detected");
				break;
				
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		if(flag==0) {
			System.out.println("Not Loop");
		}
		
	}
}

package src.prc131_140;
import src.prc131_140.LinkedList.Node;
public class MiddleOfLinkedList {
	
	public static int middle(Node head) {
		Node slow = head;
		Node fast = head.next;
		while(fast != null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
//		ll.insert(6);
		ll.displayList();
		System.out.println(middle(ll.head));
	}
}

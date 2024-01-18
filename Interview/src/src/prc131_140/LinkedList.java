package src.prc131_140;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}
	}

	public void insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node curr = list.head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}


	public void delete(LinkedList list, int data) {
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node curr = list.head;
		Node pre = null;
		while(curr.data != data && curr!=null) {
			if(curr.next == null) {
				curr = null;
			}
			else {
				pre = curr;
				curr = curr.next;
			}
		}
		if(curr == null) {
			System.out.println("Data Not found");
			return;
		}
		pre.next = curr.next;
	}
	
	public void displayList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data+" -> ");
			curr = curr.next;
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(ll, 1);
		ll.insert(ll, 2);
		ll.insert(ll, 3);
		ll.displayList();
		ll.delete(ll, 2);
		ll.displayList();
		ll.delete(ll, 1);
		ll.displayList();
		ll.insert(ll, 2);
		ll.displayList();
		ll.delete(ll, 2);
		ll.displayList();
		ll.delete(ll, 3);
		ll.displayList();
	}
}

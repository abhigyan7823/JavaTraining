package src;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next = null;
		}
	}
	
	public void addFirst(int val) {
		Node newnode = new Node(val);
		newnode.next = head;
		head = newnode;
	}

	public void addLast(int val) {
		Node newnode = new Node(val);
		if(head==null) {
			newnode.next = null;
			head = newnode;
			return;
		}
		Node tamp = head;
		while(tamp.next != null) {
			tamp = tamp.next;
		}
		tamp.next = newnode;
	}

	public void print() {
		Node tamp=head;
		while(tamp !=null) {
			System.out.print(tamp.data+" ");
			tamp = tamp.next;
		}
		System.out.println();
	}

	public void insertAfter(Node preNode, int val) {
		if(preNode==null) {
			System.out.println("Previous Node Cannot be NULL");
			return;
		}
		Node newnode = new Node(val);
		newnode.next = preNode.next;
		preNode.next = newnode;
		
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(head.next==null) {
			head = null; 
			return;
		}
		
		Node secLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			secLast = secLast.next;
			lastNode = lastNode.next;
		}
		secLast.next = null;
	}
	
	public void delete(int val) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(search(val)==false) {
			System.out.println("Data to be deleted not found");
		}
		else {
			Node pre = head;
			Node curr = head.next;
			while(curr.data != val && curr.next!=null) {
				curr = curr.next;
				pre = pre.next;
			}
			pre.next = curr.next;
		}
	}
	
	public boolean search(int val) {
		Node curr = head;
		while(curr != null) {
			if(curr.data == val) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	public void display(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data+" ");
		display(head.next);
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(5);
		ll.print();
		
		ll.addLast(1);
		ll.print();
		
		ll.addFirst(3);
		ll.print();
		
		ll.insertAfter(ll.head,10);
		ll.print();
		System.out.println("with rec");
		ll.display(ll.head);
		ll.deleteFirst();
		ll.print();
		
		ll.deleteLast();
		ll.print();
		
		ll.addLast(19);
		ll.print();
		
		ll.addLast(11);
		ll.print();
		
		ll.delete(19);
		ll.print();
		
		System.out.println(ll.search(2));
		
		ll.delete(1);
		ll.print();
		
   	}
}
package src;

public class LLrev {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    
    Node reverse(Node head) {
    	Node prev = null;
    	Node curr = head;
    	Node next = null;
    	while(curr != null) {
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	head = prev;
    	return head;
    }
    
	public static void main(String[] args) {
       LLrev ll = new LLrev();
       ll.push(4);
       ll.push(3);
       ll.push(2);
       ll.push(1);
       ll.print();
       ll.head = ll.reverse(ll.head);
       ll.print();
	}
}

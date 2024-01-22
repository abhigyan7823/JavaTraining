package src.prc131_140;

public class LinkedList {

	public Node head;

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            super();
            this.data = data;
            next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }
        Node curr = head;
        Node pre = null;
        while (curr != null && curr.data != data) {
            pre = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Data Not found");
            return;
        }
        pre.next = curr.next;
    }

    public void displayList() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.displayList();
        ll.delete(2);
        ll.displayList();
        ll.delete(1);
        ll.displayList();
        ll.insert(2);
        ll.displayList();
        ll.delete(2);
        ll.displayList();
        ll.delete(3);
        ll.displayList();
    }
}

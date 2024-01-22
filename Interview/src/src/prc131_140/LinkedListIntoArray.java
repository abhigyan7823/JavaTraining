package src.prc131_140;

import src.prc131_140.LinkedList.Node;

public class LinkedListIntoArray {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		int size =0;
		Node temp = ll.head;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		int[] arr = new int[size];
		Node temp2 = ll.head;
		int i=0;
		while(temp2 != null) {
			arr[i] = temp2.data;
			temp2 = temp2.next;
			i++;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		LinkedList list = new LinkedList();
		for(int j=0;j<arr.length;j++) {
			list.insert(arr[j]);
		}
		list.displayList();
		
	}
}

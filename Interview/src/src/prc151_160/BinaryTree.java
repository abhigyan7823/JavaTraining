package src.prc151_160;

class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	
	Node root;
	
	public void inOrder(Node root) {
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public int countNodes(Node root) {
		if(root == null) {
			return 0;
		}
		return countNodes(root.left)+countNodes(root.right)+1;
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.left.left = new Node(3);
		bt.root.left.right = new Node(4);
		bt.root.right = new Node(5);
		bt.root.right.left = new Node(6);
		System.out.print("InOrder \n");
		bt.inOrder(bt.root);
		System.out.print("\nPreOrder \n");
		bt.preOrder(bt.root);
		System.out.print("\nPostOrder \n");
		bt.postOrder(bt.root);
		System.out.print("\nTotal Nodes : "+ bt.countNodes(bt.root));
	}
}

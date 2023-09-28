package trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Queue.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		left=null;
		right=null;
	}
}

public class BinaryTree {
	Node root;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
	public void inOrder(Node root) {
		if(root == null) return ;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void preOrder(Node root) {
		if(root == null) return ;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
	}
	
	public void insert(Node node, int key) {
		if(node == null) {
			node = new Node(key);
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			if(node.left == null) {
				node.left = new Node(key);
				break;
			}
			else {
				q.add(node.left);
			}
			if(node.right == null) {
				node.right = new Node(key);
				break;
			}
			else {
				q.add(node.right);
			}
		}	
	}
	
	public int height(Node root) {
		if(root == null) return 0;
		return Math.max(height(root.left),height(root.right))+1;
	}
	
	public int count(Node root) {
		if(root == null) return 0;
		return count(root.left)+count(root.right)+1;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Height "+ tree.height(tree.root));
		System.out.println("No. of Nodes "+ tree.count(tree.root));
		System.out.println("InOrder");
		tree.inOrder(tree.root);
		System.out.println("\nPreOrder");
		tree.preOrder(tree.root);
		System.out.println("\nPostOrder");
		tree.postOrder(tree.root);
		System.out.println("\nLevelOrder");
		tree.levelOrder(tree.root);
		tree.insert(tree.root,6);
		tree.insert(tree.root,7);
		tree.insert(tree.root,8);
		tree.insert(tree.root,9);
		System.out.println("\nInOrder");
		tree.inOrder(tree.root);
		System.out.println("\nPreOrder");
		tree.preOrder(tree.root);
		System.out.println("\nPostOrder");
		tree.postOrder(tree.root);
		System.out.println("\nLevelOrder");
		tree.levelOrder(tree.root);
		System.out.println();
		System.out.println("Height "+ tree.height(tree.root));
		System.out.println("No. of Nodes "+ tree.count(tree.root));
	}
	
}

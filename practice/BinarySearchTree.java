package practice.org;

import java.util.Scanner;

public class BinarySearchTree {

	private static TreeNode root;
	private static int size;
	
	public static void main(String[] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		int choice;
		try(Scanner scan = new Scanner(System.in)) {
			do{
				System.out.println("------------------------------------");
				System.out.println("1. Insert");
				System.out.println("2. Delete");
				System.out.println("3. Search");
				System.out.println("4. Depth");
				System.out.println("5. Min");
				System.out.println("6. Max");
				System.out.println("7. Size");
				System.out.println("8. PreOrder");
				System.out.println("9. InOrder");
				System.out.println("10. exit");
				System.out.println("------------------------------------");
				System.out.println("Enter your choice");
				
				choice = scan.nextInt();
				switch(choice)
				{
					case 1:
						System.out.print("Enter the element to be inserted: ");
						int value = scan.nextInt();
						bst.insert(value);
						break;
					case 2:
						System.out.print("Enter the element to be deleted: ");
						int data = scan.nextInt();
						bst.delete(data);
						break;
					case 3:
						System.out.print("Enter the data you want to search: ");
						int elem = scan.nextInt();
						System.out.println("Found: "+bst.search(root, elem));
						break;
					case 4:
						System.out.println("Depth of the tree: "+bst.getDepth(root));
						break;
					case 5:
						System.out.println("Min elem in the tree: "+root.min());
						break;
					case 6: 
						System.out.println("Max elem in the tree: "+root.max());
						break;
					case 7:
						System.out.println("Size of the tree: "+size);
						break;
					case 8:
						bst.preOrder(root);
						break;
					case 9:
						bst.inOrder(root);
						break;
					default:
						break;
				}
			}while(choice != 10);	
		}
		
		/*int[] A = {16, 19, 10, 5, 18, 25, 2, 4, 3, 0, 30, 28};
		for(int a: A)
		{
			bst.insert(a);
		}
		System.out.println("Enter the elem you want to search: ");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		System.out.println("Found: "+bst.search(root, choice));*/
		
	}
	/*
	 * Inserts a given value in to the tree
	 */
	public void insert(int value)
	{
		if(root == null)
		{
			root = new TreeNode(value);
			size++;	
		}
		else  {
			root.insert(value);
			size++;
		}
	}
	
	/*
	 * Prints all the nodes in the order Root, Left child, Right child.
	 */
	
	public void preOrder(TreeNode root)
	{
		if(root == null)
			return;
		else {
			System.out.print(root.getData()+" ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	/*
	 * Returns a sorted order of the nodes
	 */
	public void inOrder(TreeNode root)
	{
		if(root == null)
			return;
		else {
			inOrder(root.getLeft());
			System.out.print(root.getData()+" ");
			inOrder(root.getRight());
		}
	}
	/*
	 * Returns the no.of leaves in the tree
	 */
	public int getLeaves(TreeNode root) {
		if(root == null)
			return 0;
		
		if(root.getLeft() == null && root.getRight() == null)
			return 1;
		else
			return getLeaves(root.getLeft()) + getLeaves(root.getRight());
		
		
	}
	/*
	 * Return the depth of the tree with root being at level 1
	 */
	public int getDepth(TreeNode root)
	{
		if(root == null)
			return 0;
		
		int xL = getDepth(root.getLeft());
		int xR = getDepth(root.getRight());
		
		return 1 + Math.max(xL, xR);
		
		/*if(xL > xR)
			return 1 + xL;
		else
			return 1 + xR;*/
		
	}
	/*
	 * deletes the given value node from the BST.
	 * case 1: Node to be deleted is the leaf
	 * case 2: Node to be deleted has only one child
	 * case 3: Node to be deleted has 2 children.
	 */
	public void delete(int value)
	{
		root = delete(root, value);
		size--;
	}
	private TreeNode delete(TreeNode subTreeRoot, int value)
	{
	
		if(subTreeRoot == null)
			return subTreeRoot;
		
		if(value < subTreeRoot.getData())
		{
			subTreeRoot.setLeft(delete(subTreeRoot.getLeft(), value));
		}
		else if(value > subTreeRoot.getData())
		{
			subTreeRoot.setRight(delete(subTreeRoot.getRight(), value));
		}
		else {
			//case 1 and 2: Node to be deleted is a leaf or has 1 child
			if(subTreeRoot.getLeft() == null)
				return subTreeRoot.getRight(); //Either null or has data. Either ways will be replaced
			
			else if(subTreeRoot.getRight() == null)
				return subTreeRoot.getLeft(); //Either null or has data. Either ways will be replaced
			//case 3: when the node to be deleted has 2 children. Replace the node with min element from the right subtree
			else {
				
				subTreeRoot.setData(subTreeRoot.getRight().min());
				subTreeRoot.setRight(delete(subTreeRoot.getRight(), subTreeRoot.getData()));
			}
		}
		return subTreeRoot;
	}
	/*
	 * Searches for given element in the tree. Returns true if found else false
	 */
	public boolean search(TreeNode root, int value)
	{
		if(root == null)
			return false;
		
		if(value == root.getData())
			return true;
		
		if(value < root.getData())
		{
			if(root.getLeft() != null)
			{
				search(root.getLeft(), value);
			}
			else {
				return false;
			}
		}
		else {
			if(root.getRight() != null)
			{
				return search(root.getRight(), value);
			}
			else return false;
		}
		
		return false;
	}
}

class TreeNode{
	
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public void insert(int value)
	{
		if(value == data)
			return;
		
		if(value < data)
		{
			if(left == null)
				left = new TreeNode(value);
			else 
				left.insert(value);
			
		}
		else {
			if(right == null)
				right = new TreeNode(value);
			else
				right.insert(value);
		}
					
	}
	public int min()
	{
		if(left == null)
			return data;
		else {
			return left.min();
		}
		
	}
	
	public int max()
	{
		if(right == null)
			return data;
		else
			return right.max();
		
	}
	TreeNode(int value)
	{
		this.data = value;
	}
	
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
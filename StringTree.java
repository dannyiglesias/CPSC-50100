package Tree;

import java.util.Scanner;

	
public class StringTree {
	
	        
//included as subclass
	class Node {
		String value = "";
		Node left;
		Node right;
		Node(String word) {
			value = word;
			left = null;
			right = null;
		}
		
		Node(String word, Node left1, Node right1) {
			value = word;
	        left = left1;
	        right = right1;
	    }
	}
	
	private Node root;
	
	// for adding strings to the tree.  creates new node then assesses the word against the previous word 
	public void add(String word) {
		Node temp = new Node(word);
		if (root == null) {
			root = temp;
		}
		else {
			Node p = root;
			Node prev = root;
			while (p != null) {
				prev = p;
				int cmpP = word.compareTo(p.value);
				if (cmpP < 0) {
					p = p.left;
				} 
				else {
					p = p.right;
				}
			}
			int cmpPrev = word.compareTo(prev.value);
			if (cmpPrev > 0) {
				prev.right = temp;
			}
			else {
				prev.left = temp;
			}
		}
	}
	
	// prints tree in order based on value
	private void inOrder(Node binTree) {
		if (binTree != null) {
			inOrder(binTree.left);
			System.out.print(binTree.value + " ");
			inOrder(binTree.right);
		}
	}

	// print the words in alphabetic order
	public void printTree() {
		inOrder(root);
	}
	
	public static void main(String[] args) {
		// create tree
		String input1 = null;
	    String input2 = null;
	    String input3 = null;
	    String input4 = null;
	    StringTree tree = new StringTree();
	    System.out.println("Enter 4 Values: "); //prompts user to enter 4 string values to be entered into the tree
	    Scanner input = new Scanner(System.in);
	    input1 =input.nextLine();
	    input2 =input.nextLine();
	    input3 =input.nextLine();
	    input4 =input.nextLine();
	    			          	                           
	    // adds the string values input the user to the tree
	    tree.add(input1);
	    tree.add(input2);
	    tree.add(input3);
	    tree.add(input4);
	                
	    // prints the tree
	    tree.printTree();
	}

}

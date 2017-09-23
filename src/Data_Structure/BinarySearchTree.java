package Data_Structure;

import java.util.Scanner;

/**
 * Find the length of the binary search tree
 * Sample Input 7 3 5 2 1 4 6 7
 * Sample Output 3
 * @author DonYoo
 *
 */

class Node {
	int data;
	Node next;
    Node left,right;
	Node(int data) {
		this.data=data;
        next = null;
        left=right=null;
    }

}

public class BinarySearchTree {

	public static int getHeight(Node root){	
		int heightLeft = 0;
	    int heightRight = 0;

	    if (root.left != null) {
	        heightLeft = getHeight(root.left) + 1;
	    }
	    if (root.right != null) {
	        heightRight = getHeight(root.right) + 1;
	    }
	    return (heightLeft > heightRight ? heightLeft : heightRight);
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	/*
	 * Trees: Is This a Binary Search Tree?
	 * 
	 * You are not responsible for printing any output to stdout. Your function must return true if the tree is a binary search tree; 
	 * otherwise, it must return false. Hidden code stubs will print this result as a Yes or No answer on a new line.
	 */
    static boolean checkBST(Node root) {
    	boolean resultleft = false;
    	boolean resultright = false;
    	
    	resultleft = checkdeepBST(root.left, Integer.MIN_VALUE, root.data);
    	resultright = checkdeepBST(root.right, root.data, Integer.MAX_VALUE);    	
    	return resultleft & resultright;
    }
    
    static boolean checkdeepBST(Node root, int min, int max){
    	boolean resultleft = false;
    	boolean resultright = false;

    	if(root.left == null || root.right == null){
    		return true;
    	}
    			
		if((min < root.left.data)	&&
				(root.left.data < root.data)){
			resultleft = checkdeepBST(root.left, min, root.data);
    	}
		if((root.data < root.right.data) &&
						(root.right.data < max)){
			resultright = checkdeepBST(root.right, root.data, max);  
    	}
		return resultleft & resultright;
    }

	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int T=sc.nextInt();
	        Node root=null;
	        while(T-->0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        int height=getHeight(root);
	        
	        System.out.println("get a height");
	        System.out.println(height);
	        
	        
	        System.out.println(checkBST(root));
	        sc.close();
	    }
	}
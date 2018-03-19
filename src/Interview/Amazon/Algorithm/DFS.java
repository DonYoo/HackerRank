package Algorithm;

import java.util.ArrayList;

public class DFS {
	static ArrayList <Integer> convertArray = null;
	// inOrder **************************************************
	// (Left, Root, Right) : 4 2 5 1 3
	private static void inOrderArray (Node root) {
		if (root == null){
			return;
		}
		inOrderArray(root.leftchild);
		convertArray.add(root.value);
		inOrderArray(root.rightchild);
	}

	// Preorder
	// (Root, Left, Right) : 1 2 4 5 3
	void printPreorder(Node node)
    {
        if (node == null)
            return;

        convertArray.add(node.value);
        printPreorder(node.leftchild);
        printPreorder(node.rightchild);
    }
	
	// Postorder 
	// (Left, Right, Root) : 4 5 2 3 1
	void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.leftchild);
        printPostorder(node.rightchild);
        convertArray.add(node.value);
    }
		
	public static void main(String[] args) {
		
	}

}

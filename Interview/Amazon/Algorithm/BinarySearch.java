package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Given a binary tree, find the number of pairs where sum of 2 nodes’ values equal to k
Eg:

  1
 2 3
4 5 7 


Say k=7, output =2 ( 2+5, 3+4)
 */

class Node<Integer>{
	Node<Integer> leftchild, rightchild;
	int value;
	
	public Node(int value){
		this.value = value;
		leftchild = rightchild = null;
	}
	
	public String toString(){
		return "";
	}
}


// static = common property of all objects.If we make it static,this field will get memory only once.

public class BinarySearch {
	public static Node<Integer> insert(Node<Integer> root, int value){
		Node<Integer> temp = null;
		if(root == null){
			root = new Node<Integer>(value);
		}
		// left
		else if(root.value > value){
			temp = insert(root.leftchild, value);
			root.leftchild = temp;
		}
		// right
		else if(root.value < value){
			temp = insert(root.rightchild, value);
			root.rightchild = temp;
		}
		return root;		
	}

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
	
	public static ArrayList<int[]> findPairs(Node root, int k){
		ArrayList <int[]> result = new ArrayList<>();
		convertArray = new ArrayList<>();
		inOrderArray(root);
		
		for(int i=0; i<convertArray.size()-1; i++){
			int first = convertArray.get(i);
			for(int j=i+1; j<convertArray.size(); j++){
				int second = convertArray.get(j);
				if( k == (first + second)){
					int[] temp = {first, second};
					result.add(temp);
				}
			}
		}
		return result;
	}

	static Scanner in;
	private static Node<Integer> root;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		String input = in.nextLine();
		String [] arrayInput = input.split(" ");
		
		ArrayList <Integer> realInput = new ArrayList<>();
		
		for(String eachInput: arrayInput){
			realInput.add(Integer.parseInt(eachInput));
		}
		
		int k = in.nextInt();
		root = null;
		
		for(int eachInput: realInput){
			root = insert(root, eachInput);
		}
		
		ArrayList <int[]> result = findPairs(root, k);
		for(int[] eachanswer : result){
			System.out.println(eachanswer[0] + " "+ eachanswer[1]);
		}
	}

}

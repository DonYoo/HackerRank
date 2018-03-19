package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/***
 * 
 * @author DonYoo
 *
 * Linkedlist Big o , search O(n) insert O(1)
 * 
 * Point : add(), indexof(), remove(index)
 * 			push() = add at the front.
 */

class Node {
	public int data;
	Node next;

	public Node(int value){
		data = value;
		next = null;
	}
}


class testLinkedList {
	Node head;
	Node tail;

	public testLinkedList(){
		head = null;
		tail = head;
	}

	public Node remove(int index){
		if (head == null){
			return null;
		}
		else if(index == 0){
			head = head.next;
			return head;
		}
		else{
			Node temp = head;
			// index through to index point
			for(int i =0; i<index -1; i++){
				temp = temp.next;
			}
			// link next of removing one.
			temp.next = temp.next.next;
			return head;
		}
	}

	public void add(Node node){
		if (head == null){
			head = node;
			tail = head;
		}
		else{
			tail.next = node;
			tail = tail.next;
		}
	}

	// reversed the node.
	public Node reverse(Node head)
	{
		if(head.next == null) return head;
		Node newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	// get middle of linkedlist.
	int getMiddle(Node head) {
		if (head == null){
			return -1;
		}
		Node singlepointer = head;
		Node doublepointer = head.next;

		while( doublepointer != null){
			singlepointer = singlepointer.next;
			doublepointer = doublepointer.next;
			if(doublepointer != null){
				doublepointer = doublepointer.next;
			}
		}
		return singlepointer.data;
	}

	public String toString(){
		String result ="";
		Node temp = head;
		while(temp != null){
			result += temp.data +" ";
			temp = temp.next;
		}
		return result;
	}
}

public class MyLinkedList {

	private static Scanner in;
	public static void main (String[] args){

		int caseNumber = 2;

		if (caseNumber == 1){
			in = new Scanner(System.in);

			int size = in.nextInt();
			testLinkedList myNode = new testLinkedList();

			for (int i=0; i<size; i++){
				Node nextNode = new Node(in.nextInt());
				myNode.add(nextNode);
			}

			System.out.println(myNode);
			System.out.println(myNode.getMiddle(myNode.head));

			myNode.remove(1);
			System.out.println(myNode);

			testLinkedList reversed = new testLinkedList();
			reversed.add(myNode.reverse(myNode.head));
			System.out.println(reversed);
		}

		/*
		 * 1) Given a singly linked list, swap every 2 nodes, for odd number of input; retain the last node as it is.
			Eg: Input: 5 13 15 18 20 11 6 7
			Output: 13 5 18 15 11 20 7 6
		 */
		else if(caseNumber ==2){

			LinkedList<Integer> input = new LinkedList<>();

			// set input
			Scanner in = new Scanner(System.in);

			String inputstring = in.nextLine();
			String [] splitinput = inputstring.split(" ");

			for(String eachinput: splitinput){
				input.add( Integer.parseInt(eachinput));
			}

			System.out.println(input);

			Iterator<Integer> itr=input.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());
			}
			
			LinkedList<Integer> newinput = new LinkedList<>();

			int linkedsize = input.size();
			int oddeven = linkedsize%2; // 0 for even 1 for odd.

			for(int i=linkedsize/2; i>0; i--){
				int second = input.poll();
				int first = input.poll();

				newinput.add(first);
				newinput.add(second);				
			}
			
			if( oddeven == 1){
				newinput.add(input.removeLast());
				linkedsize -= 1;
			}

			System.out.println(newinput);
		}
	}
}

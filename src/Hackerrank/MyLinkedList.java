package Hackerrank;

import java.util.*;

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


public class MyLinkedList {

	public static Node insert(Node head, int ele) {
		// TODO Auto-generated method stub
		if(head == null){
			head = new Node(ele);
		}
		else
		{
			Node temp = head;
			while(temp.next != null) temp = temp.next;
			temp.next = new Node(ele);
		}
		return head;
	}
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
        sc.close();
    }

	private static Node removeDuplicates(Node head) {
		Node temp = head;
		while(temp.next != null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;	
			}
		}
		return head;
	}
}

package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/***
 * 
 * Queues
 * @author DonYoo
 * Array => Big O : search O(1) other O(n)
 * LinkedList, Queues, Stacks => Big O : search O(n) insert O(1)
 * point : add(), poll(), peek(), remove()
 * FIFO : LILO
 * 
 * 

 */


public class myQueues<V>{
	// implement queues using stacks.
	Stack<V> stackQueue;
	
	public myQueues(){
		stackQueue = new Stack<>();
	}
	public void add(V value){
		stackQueue.push(value);
	}
	public void poll(){
		stackQueue.remove(0);
	}
	public V peek(){
		return stackQueue.elementAt(0);
	}
	public void remove(int index){
		stackQueue.remove(index);
	}
	
	public static void main(String[] args) {
		myQueues<Integer> don = new myQueues<>();
		don.add(1);
		don.add(2);
		don.add(3);
		
		System.out.println(don);
		
		System.out.println(don.peek());
		don.poll();
		System.out.println(don.peek());
		don.remove(0);
		System.out.println(don.peek());
		
		
	}
}

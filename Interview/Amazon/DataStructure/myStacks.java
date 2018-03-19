package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/***
 * 
 * Stack
 * point : push(), pop(), peek(), remove()
 * FILO = LIFO
 * @param <V>
 */


public class myStacks {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		
		
		System.out.println("Stack :");
		System.out.println("push :");
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		System.out.println(myStack);
		myStack.pop();
		System.out.println("pop :");
		System.out.println(myStack);

		System.out.println("\nQueue");
		Queue myQueue = new LinkedList();
		System.out.println("add :");
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		System.out.println(myQueue);
		myQueue.poll();
		System.out.println("poll :");
		System.out.println(myQueue);		
	}

}

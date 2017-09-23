package Data_Structure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * 
 * 
 * @author DonYoo
 *
 *A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.

 */
public class My_Queues {
	
	/* very important point here.
	 the reason that this class has to be static, 
	 because this class is under My_Queues and
	 from main it is trying to call a MyQueue class.
	 so because of making MyQueue as static class 
	 it can be shared in My_Queue class
	 
	 all the static variable, method, class are load on static memory
	 
	 */
	@SuppressWarnings("hiding")
	public static class MyQueue<Integer>{

		private Stack <Integer>st = new Stack<>();
		
		public void enqueue(Integer nextInt) {
			st.push(nextInt);
		}

		public void dequeue() {
			st.remove(0);
		}

		public Integer peek() {
			return st.firstElement();
		}
	}

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}


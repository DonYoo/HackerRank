package Amazon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


/*
 * 
 * FIFO = Stack : push/pop    push 1,2,3	pop = 3		ex)plate on restaurent
 * LIFO = Queue : add/poll    add 1,2,3 	poll = 1	ex)customer in cinema
 * Deque : addFirst/
 */


public class MyDeque {
	private static Scanner in;
	
	static class Superstar {
		public int value;
		public boolean repeat;
		public Superstar(){
			value = 0;
			repeat = false;
		}
	}
	
	public static void main (String[] args) {
	    in = new Scanner (System.in);
	    int testcase = in.nextInt();
	    
	    for(int i=0; i<testcase; i++){
	        int numberofinputs = in.nextInt();
	        Stack <Integer>st = new Stack<>();
	        Deque <Integer>star = new LinkedList<>();

	        for(int j=0; j<numberofinputs; j++){
	            st.push(in.nextInt());    
	        }
	        Superstar superstar = new Superstar();
	        
	        for(int j=0; j<numberofinputs; j++){
	            int end = st.pop();
	            if(end>superstar.value){
	                superstar.value = end;
	                superstar.repeat = false;
	                star.addFirst(end);
	            }
	            else if(end == superstar.value){
	            	superstar.repeat = true;
	            }
	        }
	        for(int k:star){
	        	System.out.print(k + " ");
	        }
	        if(superstar.repeat == true){
	        	superstar.value = -1;
	        }
	        System.out.println("\n" + superstar.value);
	    }
	}
}

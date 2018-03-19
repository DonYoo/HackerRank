package Amazon;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 * 
 * @author DonYoo
 *
 *

Given an input stream of n integers the task is to insert integers to stream 
and print the median of the new stream formed by each insertion of x to the stream.
 
Flow in stream : 5, 15, 1, 3 
5 goes to stream --> median 5 (5)
15 goes to stream --> median 10 (5, 15)
1 goes to stream --> median 5 (5, 15, 1)
3 goes to stream --> median 4 (5, 15, 1, 3)

Example:
Input:
4
5
15
1 
3

Output:
5
10
5
4

 *
 *
 */

public class Find_Median {
	public static void main(String[] args) {
		PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> high = new PriorityQueue<>();
		
		Scanner in = new Scanner(System.in);
		
		int total = in.nextInt();
		int input = in.nextInt();
		int median = input;
		System.out.println(median);
		
		high.add(input);
		for(int i=1; i<total; i++){
			input = in.nextInt();
			// add
			if(high.peek()>input){
				low.add(input);
			}
			else{
				high.add(input);
			}
			// make it balanced
			if(i%2==1){ // even
				if(high.size()>low.size()){
					low.add(high.poll());
				}
				else if(high.size()<low.size()){
					high.add(low.poll());
				}
				median = (low.peek()+high.peek())/2;
			}
			else{
				if(high.size()>low.size()){
					median = high.peek();
				}
				else if(high.size()<low.size()){
					median = low.peek();
				}
			}
			System.out.println(median);
		}
	}
}

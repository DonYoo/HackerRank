package Important;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 The median of a dataset of integers is the midpoint value of the dataset 
 for which an equal number of integers are less than and greater than the value.
 To find the median, you must first sort your dataset of integers in non-decreasing order, 
 then:

 If your dataset contains an odd number of elements,
 the median is the middle element of the sorted sample. 
 In the sorted dataset {1,2,3}, 2 is the median.
 
 If your dataset contains an even number of elements, the median is the average of the 
 two middle elements of the sorted sample. 
 In the sorted dataset {1,2,3,4}, (2+3)/2 = 2.5 is the median.
 
 Given an input stream of  integers, you must perform the following task for each  integer:

 1. Add the  integer to a running list of integers.
 2. Find the median of the updated list (i.e., for the first element through the  element).
 3. Print the list's updated median on a new line. The printed value must be a double-precision
 number scaled to decimal place (i.e.,  format).

Sample Input
6
12
4
5
3
8
7

Sample Output
12.0
8.0
5.0
4.5
5.0
6.0

Explanation

There are n=6 integers, so we must print the new median on a new line as each integer is added to the list:

list {12}, median = 12.0
list {12,4}->{4,12}, median = (12+4)/2 = 8.0
list {12,4,5}->{4,5,12}, median = 5
list {12,4,5,3}->{3,4,5,12}, median = (4+5)/2 = 4.5
list {12,4,5,3,8}->{3,4,5,8,12}, median = 5
list {12,4,5,3,8,7}->{3,4,5,7,8,12}, median = (5+7)/2 = 6 


 */
public class Heaps {
	private static Scanner in;
	private static PriorityQueue<Integer> low;
	private static PriorityQueue<Integer> high;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int size = in.nextInt();
		
		low = new PriorityQueue<>(Collections.reverseOrder()); // 5,4,3
		high = new PriorityQueue<>(); // 7,8,12
		
		for(int i=0;i<size;i++){
			int input = in.nextInt();
			
			// add low if input is smaller than lowest high value
			if(high.peek() !=null && input < high.peek()){
				low.add(input);
			}
			else{
				high.add(input);
			}
			
			// make a even size.
			if(low.size() > high.size()+1){
				high.add(low.poll());
			}
			if(low.size()+1 < high.size()){
				low.add(high.poll());
			}
			
			// print out depends on the size.
			if(low.size() == high.size()){
				double temp = (low.peek()+high.peek())/2.0;
				System.out.printf("%.1f\n",temp);
			}
			else if(low.size() > high.size()){
				System.out.println((double)low.peek());
			}
			else{
				System.out.println((double)high.peek());
			}
		}
	}
}

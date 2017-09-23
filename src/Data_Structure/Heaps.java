package Data_Structure;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 * Heaps: Find the Running Median
 * 
 * If your dataset contains an odd number of elements, the median is the middle element of the sorted sample. 
 * In the sorted dataset ,  is the median.
	If your dataset contains an even number of elements, the median is the average of the two middle elements of the sorted sample
	In the sorted dataset ,  is the median.
	
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

 */

public class Heaps {

	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int n = in.nextInt();
        
        PriorityQueue< Integer > low = new PriorityQueue <>(Collections.reverseOrder());	//
        PriorityQueue< Integer > high = new PriorityQueue <>();
        
        for(int a_i=0; a_i < n; a_i++){
        	int data = in.nextInt();
        	
        	// if the data is smaller than high peek value, put it in low.
    		if((high.peek() != null) && (data < high.peek())){
    			low.add(data);
    		}
    		else{
    			high.add(data);    			
    		}
    		// if total number list is odd
        	if( (a_i % 2) == 0){
        		if (low.size() > high.size()){
        			System.out.printf("%d.0\n", low.peek());
        		}
        		else{
            		System.out.printf("%d.0\n", high.peek());
        		}
        	}
        	else{					// even
        		// if low size is greater than high size, 
        		if(low.size() > high.size()){
        			high.add(low.poll());
        		}
        		// if high size is greater than low size.
        		else if (low.size() < high.size()){
        			low.add(high.poll());
        		}
        		// do nothing when low and high queue size are the same
        		System.out.printf("%.1f\n",(double)(low.peek() + high.peek()) / 2);
        	}
        }       
	}
}

package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * 
 * @author DonYoo
 *
 *

Sample Input 0

3
1 2 3
Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
Explanation 0 
The array is already sorted, so  swaps take place and we print the necessary three lines of output shown above.

Sample Input 1

3
3 2 1
Sample Output 1

Array is sorted in 3 swaps.
First Element: 1
Last Element: 3

 *
 *
 *
 *
 */
public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sortedArray[] = new int[n];
        for(int i = 0; i < n; i++){
        	sortedArray[i] = in.nextInt();
        }
        
		int NumberofSwap = 0;
		int firstElement = 0;
		int lastElement = 0;
		
		
        for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1; j++) {
	            // Swap adjacent elements if they are in decreasing order
	            if (sortedArray[j] > sortedArray[j + 1]) {
	            	int temp = sortedArray[j];
	            	sortedArray[j] = sortedArray[j + 1];
	            	sortedArray[j + 1] = temp;
	                NumberofSwap++;
	            }
	        }
        }
        firstElement = sortedArray[0];
        lastElement = sortedArray[n-1];

        
        System.out.println("\nArray is sorted in "+ NumberofSwap + " swaps.");
        System.out.println("First Element: "+ firstElement);
        System.out.println("Last Element: "+ lastElement);
        
    	/**
    	 * .sorted() : sort the list<br>
    	 * .collect(Collectors.toList()) : accumulate elements into collections
    	 */
        /*
    List<Integer> charList = new ArrayList<>();
    List<Integer> ascending	= charList.stream()
    								  .sorted()
    								  .collect(Collectors.toList());
    System.out.println("Lambda sorted in ascending order \t" + ascending);
    */
	}
}

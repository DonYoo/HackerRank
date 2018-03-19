package Amazon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author DonYoo
 *
 *Given an array. 
 *The task is to arrange the array such that odd elements occupy the odd positions and even elements occupy the even positions. 
 *The order of elements must remain same. Consider zero-based indexing. 
 *After printing according to conditions, if remaining, print the remaining elements as it is.
 *
 */
public class Even_and_Odd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int total = in.nextInt();
		for(int i =0; i<total; i++){
			int number = in.nextInt();
			int [] result = new int[number];
			
			
			int odd = 1;
			int even = 0;
			
			for(int j =0; j<number; j++){
				int list = in.nextInt();
				
				if(list%2 == 0){
					if(number <= even){
						even -= 1;
					}
					result[even] = list;
					even +=2;
				}
				else{
					if(number <= odd){
						odd -= 1;
					}
					result[odd] = list;
					odd +=2;
				}
			}
			for(int s =0; s<number; s++){
				System.out.print(result[s]+" ");
			}
			System.out.println();
		}
	}
}

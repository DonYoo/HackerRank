package HackerRank_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author DonYoo
 *
 *
 *
Sample Input

1 2 3 4 5
Sample Output

10 14

If we sum everything except 1, our sum is 14.
If we sum everything except 2, our sum is 13.
If we sum everything except 3, our sum is 12.
If we sum everything except 4, our sum is 11.
If we sum everything except 5, our sum is 10.
 */
public class Min_Max_Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long [] list = new long[5];
		long total = 0;
		for(int i=0; i<5; i++){
			list[i] = scan.nextInt();
			total += list[i];
		}

		long min = total - list[0];
		long max = 0;
		for(int i=0; i<5; i++){
			long sum = total - list[i];
			if(sum < min){
				min = sum;
			}
			else if(sum > max){
				max = sum;
			}
		}
		System.out.println(min + " " + max);
	}
}

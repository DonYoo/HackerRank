package HackerRank_Algorithm;

import java.util.Scanner;

/**
 * 
 * @author DonYoo
 *
 *
 *
 *
Sample Input 

4
3 2 1 3
Sample Output 

2

Explanation 

We have one candle of height , one candle of height , and two candles of height . 
Colleen only blows out the tallest candles, meaning the candles where . 
Because there are  such candles, we print  on a new line.


 */
public class Birthday_Cake_Candles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberofCandles = scan.nextInt();
		int count = 0;
		int tallest = 0;
		
		for(int i = 0; i<numberofCandles; i++){
			int candle = scan.nextInt();
			if(tallest < candle){
				tallest = candle;
				count = 1;
			}
			else if(candle == tallest){
				count++;
			}
		}
		System.out.println(count);
	}
}

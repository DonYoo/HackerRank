package Amazon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Odd_to_Even {

	static void OddtoEven(int input){
		if(input < 10){
			System.out.println(input);
			return;
		}
		int last_odd = input%10;
		input /=10;
		String sNumber = Integer.toString(input);
		char[] cNumber = sNumber.toCharArray();
		int switchnumber = last_odd;
		int index = Integer.MAX_VALUE;
		for(int i = 0; i<cNumber.length; i++){
			int value = Character.getNumericValue(cNumber[i]);
			if(value%2==0) {
				index = i;
				switchnumber = value;
				if(value<last_odd){
					break;
				}
			}
		}
		if(index != Integer.MAX_VALUE){
			cNumber[index] = Integer.toString(last_odd).charAt(0);
		}
		
		System.out.print(cNumber);
		System.out.println(switchnumber);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		for(int i=0; i<total; i++){
			OddtoEven(in.nextInt());
		}
	}
}

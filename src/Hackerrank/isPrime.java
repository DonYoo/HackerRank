package Hackerrank;
import java.util.*;

public class isPrime {
	
	/**
	 * calculate if number is prime.<br>
	 * big O of square root N.
	 * @param number
	 */
	private static void isPrime(int number) {
		if(number % 2 == 0){
			if(number == 2){
				System.out.println("Prime");
			}
			else{
				System.out.println("Not prime");
			}
		}
		else if(number % 3 == 0){
			if(number == 3){
				System.out.println("Prime");
			}
			else{
				System.out.println("Not prime");
			}
		}
		else if(number == 1){
			System.out.println("Not prime");
		}
		else
		{
			String result = "Prime";
			int sqrtNumber = (int) Math.sqrt(number);
			while(sqrtNumber > 4){
				if(number % sqrtNumber == 0){
					result = "Not prime";
					break;
				}
				sqrtNumber--;
			}
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    while(N-- > 0) {
	    	int number = sc.nextInt();
	    	isPrime(number);
	    }
	    sc.close();   
	}
}

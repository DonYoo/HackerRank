package Hackerrank;
import java.util.*;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		int first_Int = scan.nextInt();
        double second_double = scan.nextDouble();
        //returns everything after f until the beginning of the next line; 
        //because there are no characters there, it returns an empty String.
        scan.nextLine();
        String third_String = scan.nextLine();
        scan.close();


        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(first_Int + i);
        System.out.println(second_double + d);
        System.out.println(s + third_String);
	}

}

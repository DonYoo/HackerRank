package Hackerrank;




/*
 * Task 
Your local library needs your help! 
Given the expected and actual return dates for a library book, 
create a program that calculates the fine (if any). The fee structure is as follows:
 */

/*
 * Nested means the Integer.parseInt()
 * something that change the type over.
 */

import java.io.*;
import java.util.*;

public class Nested_Logic {

    public static void main(String[] args) {
    	
    	// STDIN STDOUT with Scanner(System.in)
    	
    	Scanner scan = new Scanner(System.in);
    	String ActualDate = scan.nextLine();
    	String ExpectedDate = scan.nextLine();
    	
    	String[] ActualDateArray = ActualDate.split(" ");
    	String[] ExpectedDateArray = ExpectedDate.split(" ");

    	int ActualDateDay = Integer.parseInt(ActualDateArray[0]);
    	int ActualDateMonth = Integer.parseInt(ActualDateArray[1]);
    	int ActualDateYear = Integer.parseInt(ActualDateArray[2]);
    	
    	int ExpectedDateDay = Integer.parseInt(ExpectedDateArray[0]);
    	int ExpectedDateMonth = Integer.parseInt(ExpectedDateArray[1]);
    	int ExpectedDateYear = Integer.parseInt(ExpectedDateArray[2]);
    	
    	int LateFee = 0;
    	
    	int year = (ActualDateYear - ExpectedDateYear);
    	int month = (ActualDateMonth - ExpectedDateMonth);
    	int day = (ActualDateDay - ExpectedDateDay);
    	
    	if(year == 0 && month == 0){
    		if(day > 0){
    			LateFee = day *15;
    		}
    	}
    	else if(year==0){
    		if(month >0){
    			LateFee = month *500;
    		}
    	}
    	else if(year>0){
    		LateFee = 10000;
    	}
    	/*  // real life
    	 *  
    	List<Integer> calculateFee = new ArrayList<>();

    	// if the number is positive, add the fee.
    	calculateFee.add(ActualDateYear - ExpectedDateYear);
    	calculateFee.add(ActualDateMonth - ExpectedDateMonth);
    	calculateFee.add(ActualDateDay - ExpectedDateDay);
    	
    	// more than a 2 year
    	if(calculateFee.get(0) > 1){
    		LateFee = 10000;
    	}
    	// more or less than a year within a year
    	if(calculateFee.get(0) == 1){
    		// more than a year
    		if(calculateFee.get(1) > 0){
    			LateFee = 10000;
    		}
    		// less than a year
    		if(calculateFee.get(1) < 0){
    			// more than month
    			LateFee = (calculateFee.get(1)+12) * 500;
        		if(calculateFee.get(1) == -11){
        			if(calculateFee.get(2) > 0){
            			LateFee = calculateFee.get(2) * 15;
            		}
        			else{
        				LateFee = (calculateFee.get(2) + 31) * 15;
        			}
        		}
    		}
    		// within same month
    		else if(calculateFee.get(1) == 0){
    			// more than a year
    			if(calculateFee.get(2) > 0){
    				LateFee = 10000;
    			}
    			// less than a year
    			else{
    				LateFee = (calculateFee.get(1)+12) * 500;
    			}
    		}
    	}
    	// less than a year within same year
    	else if (calculateFee.get(0) == 0){
    		if(calculateFee.get(1) > 0){
    			LateFee = calculateFee.get(1) * 500;
    		}
    		else if(calculateFee.get(2) > 0){
    			LateFee = calculateFee.get(2) * 15;
    		}
    	}
    	*/
    		
    	System.out.println(LateFee);
    }
}
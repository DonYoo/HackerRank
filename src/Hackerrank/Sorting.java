package Hackerrank;
import java.io.*;
import java.util.*;

public class Sorting {

	private static void printArray(String s, int[] x) {
        System.out.print(s + " Array: "); 
        for(int i : x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void bubbleSort(int[] x) {
        int endPosition = x.length - 1;
        int swapPosition;
        int numberofSwap = 0;
        while( endPosition > 0 ) {
            swapPosition = 0;
            
            for(int i = 0; i < endPosition; i++) {
                
                if( x[i] > x[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;
                    
                    swapPosition = i;
                    numberofSwap++;
                } // end if
            } // end for
            endPosition = swapPosition;
        } // end while
        
        System.out.println("Array is sorted in " + numberofSwap +" swaps.");
        System.out.println("First Element: "+ x[0]);
        System.out.println("Last Element: "+ x[x.length - 1]);
    } // end bubbleSort
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NumberofArray = scan.nextInt();
		int[] intArray = new int[NumberofArray];
		for(int i = 0; i < NumberofArray; i++){
			intArray[i] = scan.nextInt();
		}
        scan.close();

        bubbleSort(intArray);
    }
}

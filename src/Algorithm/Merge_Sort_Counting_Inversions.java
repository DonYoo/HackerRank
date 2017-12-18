package Algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * 
 * @author DonYoo
 *
 *
Output Format

For each of the  datasets, print the number of inversions that must be swapped to sort the dataset on a new line.

Sample Input

2  
5  
1 1 1 2 2  
5  
2 1 3 1 2
Sample Output

0  
4   

 */
public class Merge_Sort_Counting_Inversions {

    private static long countInversions(int[] arr) {
        int[] aux = arr.clone();
        return countInversions(arr, 0, arr.length - 1, aux);
    }

    private static long countInversions(int[] arr, int lo, int hi, int[] aux) {
        if (lo >= hi) return 0;

        int mid = lo + (hi - lo) / 2;

        long count = 
        countInversions(aux, lo, mid, arr) +
        countInversions(aux, mid + 1, hi, arr) +
        merge(arr, lo, mid, hi, aux);

        return count;
    }

    private static long merge(int[] arr, int lo, int mid, int hi, int[] aux) {
        long count = 0;
        int left = lo, right = mid + 1, k = lo;
        while (left <= mid || right <= hi) {
            if (left > mid) {
                arr[k++] = aux[right++];
            } else if (right > hi) {
                arr[k++] = aux[left++];
            } else if (aux[left] <= aux[right]) {
                arr[k++] = aux[left++];
            } else {
                arr[k++] = aux[right++];
                count += mid + 1 - left;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
}
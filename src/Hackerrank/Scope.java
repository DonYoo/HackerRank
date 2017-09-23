package Hackerrank;

import java.util.*;


class Difference {
  	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
  		for(int n : a){
  			elements = a;
  		}
	}
  	
  	public void computeDifference(){
  		for(int n : elements){
  			for( int next = 1; next<elements.length; next++){
  				if(Math.abs(n - elements[next]) > maximumDifference){
  					maximumDifference = Math.abs(n - elements[next]);
  				}
  			}
  		}
  	}
	private int[] elements;
  	public int maximumDifference;
  	
}


public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

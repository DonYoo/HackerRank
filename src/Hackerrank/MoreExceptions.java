package Hackerrank;
import java.util.*;


class Calculator{
    public Calculator(){
        answer = 0;
    }
    
    public int power(int firstInt, int secondInt) throws Exception{
    	if(firstInt < 0 || secondInt < 0){
    		throw new Exception("n and p should be non-negative");
    	}
    	answer = (int)Math.pow(firstInt, secondInt);
    	return answer;
    }
    private int answer;
}

public class MoreExceptions {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        in.close();

    }
}

/*SubString II*/
import java.util.Scanner; //Scanner Class 

public class Solution7 {
	 public static String getSmallestAndLargest(String s, int k) {
		 	String current = s.substring(0, k);
		 	String smallest = current;
	        String largest = current;
	        
	        
	        for(int i = k; i < s.length(); i++)
	        {
	        	current = current.substring(1, k) + s.charAt(i);
	        	if(largest.compareTo(current) < 0)
	        		largest = current;
	        	if(smallest.compareTo(current) > 0)
	        		smallest = current;
	        }
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
}

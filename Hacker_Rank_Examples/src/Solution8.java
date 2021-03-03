/*Palindrome Check (Yes or No)*/
import java.util.*;
import java.io.*;
public class Solution8 {
	public static boolean palindromeCheck(String s)
	{
		int i = 0;
		int j = s.length() - 1;
		while(i < j)
		{
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		if(palindromeCheck(A))
			System.out.print("Yes");
		else
			System.out.print("No");
			
	}

}

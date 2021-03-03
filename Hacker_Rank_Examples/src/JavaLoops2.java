/*
 Program Name: Java Loops II (Hacker Rank Problem)
 - q, denoting the number of queries
 - i, index of the values within the query 
 	- a,b,n are values for that query
 */
import java.util.*;
import java.io.*;
public class JavaLoops2 
{
	public static void main(String []argh)
	{
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n; j++)
            {
            	a = a + (int) Math.pow(2, j)*b;
            	System.out.print(a+ " ");
            }
            System.out.println();//Clear a line
        }
        in.close();
    }

}

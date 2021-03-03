/*Program Name: Output Formatting 
 - Left indent by 15 characters 
 - Expressed in 3 digits (if needed, add leading zeros)
 */
import java.util.*;

public class OutputFormatting 
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d \n", s1,x);
            //Complete this line
        }
        System.out.println("================================");

}
}

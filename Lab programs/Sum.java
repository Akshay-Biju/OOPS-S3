import java.util.*;
public class Sum
{
	public static void main(String args[])
        {

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Two Numbers:");
            float a=sc.nextFloat();
            float b=sc.nextFloat(); 
            float sum=a+b;
            float avg = sum/2;
            System.out.println ("The sum of is:" +sum);
            System.out.println("The average of the numbers is "+avg);
            sc.close();
		}
}
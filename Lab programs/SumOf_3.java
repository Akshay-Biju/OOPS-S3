import java.util.*;
public class SumOf_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=a+b+c;
		double avg=sum/3;
		System.out.println("The sum of three numbers is "+sum);
		System.out.println("The average of three numbers is "+avg);
	}
}
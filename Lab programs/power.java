import java.lang.*;
import java.util.*;
public class power
{
	public static void main(String args[])
	{
		int a,b,c;
		double sqr,powr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for rooting");
		a=sc.nextInt();
		sqr=Math.sqrt(a);
		System.out.println("The square root of "+a+" is "+sqr);
		System.out.println("Enter number for finding power");
		b=sc.nextInt();
		System.out.println("Enter the power of the given number");
		c=sc.nextInt();
		powr=Math.pow(b,c);
		System.out.println("The power is "+powr);
	}
}
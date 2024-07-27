import java.util.*;
public class details
{
	public static void main(String args[])
	{
		String name,clas;
		int roll;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		System.out.println("Enter class");
		System.out.println("Enter roll number");
		name=sc.nextLine();
		clas=sc.nextLine();
		roll=sc.nextInt();
		System.out.println("Name is "+name);
		System.out.println("Class is "+clas);
		System.out.println("Roll number is "+roll);
	}
}
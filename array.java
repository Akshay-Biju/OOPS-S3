import java.util.*;
public class array
{
        public static void main(String args[])
        {
                int sum=0;
                int arr[]=new int[100];
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter length of array");
                int l=sc.nextInt();
                System.out.println("Enter elements of array: ");
                for(int i=0;i<l;i++)
                {
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<l;i++)
                {
                        sum=sum+arr[i];
                }
                System.out.println("Sum of array elements is: "+sum);
        }
}

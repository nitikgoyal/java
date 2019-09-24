package search.in;
import java.util.*;

public class LinearSearch 
{

	public static int Lsearch(int A[],int Key)
	{
		int n=A.length;
		for(int i=0;i<n;i++)
		{
			if(Key==A[i])
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("ENter the size of array");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values of array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the element u want to search");
		int key=scan.nextInt();
		int index=Lsearch(a,key);
		if(index>=0)
			System.out.println("ELement "+key+" found at the index"+index);
		else
			System.out.println("ELment "+key+"not found");
		
		
	}
}

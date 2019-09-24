package search.in;
import java.util.*;

public class Insertionsort 
{
	public static void Inssort(int arr[])
	{
		int key;
		int index;
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			key=arr[i];
			index=i-1;
			while(index>=0 && arr[index]>key)
			{
				arr[index+1]=arr[index];
				index--;
			}
			arr[index+1]=key;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		Inssort(arr);
		
	}

}

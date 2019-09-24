package search.in;

import java.util.*;  
public class BinarySearch
{ 
	public static void bsort(int a[])
{
	int n=a.length;
	
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j+1]<a[j])
			{
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
	public static int bsearch(int arr[],int start,int end,int key)
	{
		int n=arr.length;
		if(end>=start)
		{
			int mid = start+(end-start)/2;
			if(arr[mid]==key)
			{
			return mid;	
			}
			else if(arr[mid]>key)
			{
				return bsearch(arr,0,mid-1,key);
			}
			else
			{
				return bsearch(arr,mid+1,n-1,key);
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements u want");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array:-");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		bsort(a);
		System.out.println("Enter the element u wnt to search");
		int key=scan.nextInt();
		int result=bsearch(a,0,n-1,key);
		if(result==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("Eleemnt "+key+"found at"+result);
		}
		
	}
}

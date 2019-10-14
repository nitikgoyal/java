package com.in;
import java.util.*;
public class SearchInArray 
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter Array : ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter element to search");
	int search=sc.nextInt();
	for (int i = 0; i < n ; i++) {
        if(search == a[i]){
           System.out.println(search+" is present at index "+i);
           break;
        }
        else
        {
        	System.out.println(search+" is not present");
        	break;
        }
    }
	
	}
}

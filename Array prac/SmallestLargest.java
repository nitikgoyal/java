package com.in;
import java.util.*;
public class SmallestLargest 
{
	static int getSmallest(int[] a){  
		int temp;  
		for (int i = 0; i < 10; i++)   
		        {  
		            for (int j = i + 1; j < 10; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
		}
	static int getLargest(int[] a){  
		int temp;  
		for (int i = 0; i < 10; i++)   
		        {  
		            for (int j = i + 1; j < 10; j++)   
		            {  
		                if (a[i] < a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
		}
		public static void main(String args[])
		{  
			Scanner sc=new Scanner(System.in);
		int a[]=new int[10]; 
		System.out.println("Enter Array: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Smallest: "+getSmallest(a));  
		System.out.println("Largest: "+getLargest(a));  
		}
}

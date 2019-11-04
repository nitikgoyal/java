import java.util.Scanner;
import java.util.HashMap;
public class Airport_checking
{
	static String check(int key,int a[])
	{
		int l=a.length;
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(a[i]==key)
			{
				count++;
			}
		}
		if(count==1)
		{
			return "Checked";
		}
		else
		{
			return "Duplicate";
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
         HashMap<Integer,String> hm=new HashMap();
		System.out.println("Enter the number of Passengers :");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter boarding pass number:");
		for(int i=0;i<n;i++)
		{
			int key=scan.nextInt();
			a[i]=key;
			hm.put(key, check(key,a));
			System.out.println( check(key,a));
		}
	}

}

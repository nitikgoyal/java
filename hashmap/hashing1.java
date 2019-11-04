import java.util.Scanner;
import java.util.HashMap;
public class hashing1 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		HashMap<String,Integer> hm=new HashMap();
		for(int i=0;i<n;i++)
		{
			String value=scan.next();;
			int key=scan.nextInt();
			hm.put(value,key);
		}
		int ch=scan.nextInt();
        if(hm.containsValue(ch))
		{
			for(Object o:hm.keySet())
			{
				if(hm.get(o).equals(ch))
				{
					System.out.print(o+" ");
				}
			}
		}
		else
		{
			System.out.println("Not found");
		}
	}
}

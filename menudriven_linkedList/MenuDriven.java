import java.util.*;
public class MenuDriven
{	
	public static void main(String args[])

	{
		Scanner sc=new Scanner(System.in);
	System.out.println("To Insert data Press 1");
	System.out.println("To Delete data Press 2 ");
	System.out.println("To Display data Press 3");
	int choice=sc.nextInt();
	LinkedList2 li=new LinkedList2();
	switch(choice)
	{
	case 1 :
		System.out.println("To Insert data at Begnning Press 1");
		System.out.println("To Insert data at Ending Press 2");
		System.out.println("To Insert data at Particular Index Press 3 ");
		System.out.println("To Insert the list Press 4");
		int c=sc.nextInt();
		switch(c)
		{
	case 1:
		System.out.println("Enter Data: ");
		int data=sc.nextInt();
		  li.addbeg(li,data);
		  break;
	case 2:
		System.out.println("Enter Data: ");
		int end=sc.nextInt();
		li = li.insert(li,end);
		break;
	case 3:
		System.out.println("Enter Index: ");
		int place=sc.nextInt();
		System.out.println("Enter Data: ");
		int d=sc.nextInt();
		li.add(li, d, place);
		break;
	case 4:
		System.out.println("Enter Number of elements you want to add: ");
		int n=sc.nextInt();
		System.out.println("Enter Data: ");
		for(int i=0;i<n;i++)
		{
		int end1=sc.nextInt();
		li = li.insert(li,end1);
		}
		break;
		}
		break;
	case 2 :
		System.out.println("To Delete data at Begnning Press 1");
		System.out.println("To Delete data at Particular Index Press 2 ");
		System.out.println("To Delete data at Ending Press 3");
		int c1=sc.nextInt();
		switch(c1)
		{
	case 1:
		int index=0;
		li.del(li,index);
		break;
	case 2:
		System.out.println("Enter Index: ");
		int index1=sc.nextInt();
		li.del(li,index1);
		break;
	case 3:
		li.del(li);
		break;
		}
		break;
	case 3:
		li.display(li);
		break;
	}
	System.out.println("Exit ---- y/n?");
	char ch=sc.next().charAt(0);
	switch(ch)
	{
	case 'y':
		System.out.println("Successfully Exit");
		break;
	case 'n':
		MenuDriven md=new MenuDriven();
		md.main(args);
		break;
	}
	}
}
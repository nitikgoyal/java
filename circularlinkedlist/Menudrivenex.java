import java.util.*;

public class Menudrivenex
{	
	public static void main(String args[])

	{
         Scanner sc=new Scanner(System.in);
	System.out.println("To Insert data Press 1");
	System.out.println("To Delete data Press 2 ");
	System.out.println("To Display data in forward Press 3");
    System.out.println("To Display data in reverse Press 4");
	int choice=sc.nextInt();
	circulardoublell dl = new circulardoublell();
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
		  dl.insertionstart(dl,data);
		  break;
	case 2:
		System.out.println("Enter Data: ");
		int end=sc.nextInt();
		dl = dl.insertion11(dl,end);
		break;
	case 3:
		System.out.println("Enter Index: ");
		int place=sc.nextInt();
		System.out.println("Enter Data: ");
		int d=sc.nextInt();
        dl.insertion(dl,d,place);
		break;
	case 4:
		System.out.println("Enter Number of elements you want to add: ");
		int n=sc.nextInt();
		System.out.println("Enter Data: ");
		for(int i=0;i<n;i++)
		{
		int end1=sc.nextInt();
		dl = dl.insertion11(dl,end1);
		}
		break;
		}
		break;
	case 2 :
		System.out.println("To Delete data at Begnning Press 1");
		System.out.println("To Delete data at Particular Index Press 2 ");
		int c1=sc.nextInt();
		switch(c1)
		{
	case 1:
		dl.deletestart(dl);
		break;
	case 2:
		System.out.println("Enter Index: ");
		int k=sc.nextInt();
		dl.deleteindex(dl,k);
		break;
		}
		break;
	case 3:
            System.out.println("Display in forward direction is ....");
		   dl.displayf(dl);
		break;
    case 4:
            System.out.println("Display in reverse direction is...");
        dl.displayrev(dl); 
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
		Menudrivenex md=new Menudrivenex();
		md.main(args);
		break;
	}
	}

}
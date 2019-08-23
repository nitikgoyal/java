package doublelinklist;

import java.util.Scanner;

public class dblink_list
{
	Node head;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data =d;
			next=null;
		}
	}
	
	public static dblink_list insert(dblink_list li,int data)
	{
		Node n1 = new Node(data);
		n1.next = null;
		n1.prev = null; 
		if (li.head == null) {
			li.head = n1;
		} else {
			Node last = li.head;
			if (last.next != null) {
				last = last.next;
			}
			last.next = n1;
			n1.prev = last;
		}
		return li;
		
	}

	public static dblink_list del(dblink_list li, int index)
	{
		Node last = li.head;
		int count = 0;
		while (last != null) {
			count++;
			last = last.next;
		}
		if (li.head == null) {
			System.out.println("List is empty plz insert the element into it  :(");
		} else if (index == 0) {
			Node s = li.head;
			li.head = s.next;
			s.next.prev = null;
		} else if (index < count) {
			int a = 0;
			Node s = li.head;
			Node nn = s.next.next;
			while (a < index - 1) {
				count++;
				s = s.next;
				nn = nn.next;
			}
			nn.prev = s;
			s.next = nn;
		} else {
			System.out.println("Enter valid index.......");
		}
		return li;
	}
	
	public static void display(dblink_list l1)
	{
		Node last = l1.head;
		Node prev1 = null;
		if (l1.head == null) 
		{
			System.out.println("list is empty");
		} else 
		{
			System.out.println("in Forward  order:");
			while (last != null) 
			{
				System.out.println(last.data);
				prev1 = last;
				last = last.next;
			}
			System.out.println("in Backward order");
			while (prev1 != null) 
			{
				System.out.println(prev1.data);
				prev1 = prev1.prev;
			}
		}
	}
	public static void main(String[] args) 
	{
		dblink_list li=new dblink_list();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter choice 1 if you want to insert ");
		System.out.println("Enter choice 2 if you want to delete the element at specific index ");
		System.out.println("Enter choice 3 if you want to display ");
		
		int choice = in.nextInt();
		String ss = "yes";
		while (ss.equals("yes")) {
			switch (choice) {
			case 1:
				System.out.println("enter the elemet want to insert");
				int ele = in.nextInt();
				li = insert(li, ele);
				break;
			case 2:
				System.out.println("enter the index where you want to delete the element");
				int index = in.nextInt();
				li = del(li, index);
				break;
			case 3:
				display(li);
				break;
			default:
				System.out.println("invalid");
			}
			System.out.println("Do you want to continue");
			System.out.println("enter your choice  [yes/no]");
			ss = in.next();
			if (ss.equals("yes")) {
				System.out.println("Enter choice 1 if you want to insert");
				System.out.println("Enter choice 2 if you want to delete the element at specific index ");
				System.out.println("Enter choice 3 if you want to display ");
				System.out.println("enter your choice");
				
				choice = in.nextInt();
			}
		}
		System.out.println("BYE");
	}

	}



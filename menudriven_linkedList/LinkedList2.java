
import java.util.*;
public class LinkedList2 {
	static Node head;
	static class Node
	{
		int data;

		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public static void display(LinkedList2 li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static LinkedList2 add(LinkedList2 li,int data,int index)
	{
		Node n=new Node(data);
		n.next=null;
		Node current=li.head, prev=null;
		if(index==0 && current!=null)
		{
			li.addbeg(li, data);
			System.out.println("Data at "+index+" index added successfully.");
		}
		if(index>0 && current!=null)
		{
		int count=0;
		while(current!=null && count<index)
		{
			prev=current;
			current=current.next;
			count++;
		}
		n.next=prev.next;
		prev.next=n;
		System.out.println("Data at "+index+" index added successfully.");
		}
		if(current==null)
		{
			System.out.println("List Index out of bound.");
		}
		return li;
	
	}
	public static LinkedList2 addbeg(LinkedList2 li,int data)
	{
		Node newNode=new Node(data);
		if(li.head==null)
			li.head=newNode;
		else
		{
		newNode.next=head;
		head=newNode;
		}
		return li;
	}
	
	public static LinkedList2 insert(LinkedList2 li,int data)
	{
		Node newNode= new Node(data);
		newNode.next=null;
		if(li.head==null)
			li.head=newNode;
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static LinkedList2 del(LinkedList2 li,int index)
	{
		Node current=li.head, prev=null;
		if(index==0 && current!=null)
		{
			li.head=current.next;
			System.out.println("Data at "+index+" index deleted successfully.");
		}
		if(index>0 && current!=null)
		{
		int count=0;
		while(current!=null)
		{
			if(count==index)
			{
				prev.next=current.next;
				System.out.println("Data at "+index+" index deleted successfully.");
				break;
			}
			else
			{
				prev=current;
				current=current.next;
				count++;
			}
		}
		}
		if(current==null)
		{
			System.out.println("List Index out of bound.");
		}
		return li;
	}
	public static void del(LinkedList2 li)
	{
		Node temp=li.head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
	
}
import java.util.*;

class keyvalue
{
    static Node head;
	static class Node
	{
		int data;
        String str;
		Node next;
		Node(int d,String s)
		{
			data=d;
            str=s;
		}
	}
    public static keyvalue insert(keyvalue li,int data,String str)
    {
      Node newNode=new Node(data,str);
        newNode.next=null;
        if(li.head==null)
        {
            li.head=newNode;
        }
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
    
        

public static void display(keyvalue li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.println(temp.data+" : "+temp.str);
			temp=temp.next;
        }
	}
    
    public static keyvalue del(keyvalue li,int key)
    {
      Node current=li.head, prev=null;
		if(key==0 && current!=null)
		{
			li.head=current.next;
			System.out.println("Data at "+key+" index deleted successfully.");
		}
		if(key>0 && current!=null)
		{
		int count=0;
		while(current!=null)
		{
			if(count==key)
			{
				prev.next=current.next;
				System.out.println("Data at "+key +" index deleted successfully.");
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
    
    
    public static keyvalue delvalue(keyvalue li,String v)
    {
        Node temp=li.head;
	int flag=0;
	if(li.head==null)
	{
		System.out.println("LL is Empty");
		flag=1;
	}
	else
	{
	   while(temp!=null)
	   {
		Node current=li.head,prev=null;
	   if(current.next==null && current.str.equals(v))
	    {
		li.head=null;
		flag=1;
		break;
	    }
	else if(current.next!=null && current.str.equals(v))
	{
		li.head=current.next;
		flag=1;
	}
	else 
	{
		while(current!=null)
		{
			if(current.str.equals(v))
			{
				prev.next=current.next;
				flag=1;
				break;
			}
			else
			{
				prev=current;
				current=current.next;
			}
		}
		if(flag==0)
		{
			System.out.println("Value doesn't exist");
			break;
		}
	}
	temp=temp.next;
	
	}
	}
	
	return li;
        
    }
    
    
    
    
    public static keyvalue deleteboth(keyvalue li,int k,String v)
    {
        Node current=head,current1=head;
	   Node prev=null;
	if(head==null)
	{
		System.out.println("LL is empty");
	}
	else if(current.next==null && current.data==k)
	{
		if(current.str.equals(v))
		{
			head=null;
		}
		else {
			System.out.println("Value doesn't match the key");
		}
		
	}
	else if(current.next!=null && current.data==k)
	{

		if(current.str.equals(v))
		{
			head=current.next;
		}
		else {
			System.out.println("Value doesn't match the key");
		}
		
	}
	else 
	{
		while(current1!=null)
		{
			if(current1.data==k)
			{
				if(current1.str.equals(v))
				{
				prev.next=current1.next;
				break;
				}
				else {
					System.out.println("Value doesn't match the key");
					break;
				}
				
			}
			else
			{
				prev=current1;
				current1=current1.next;
			}
		}
	}
	if(current1==null)
	{
		System.out.println("Pair doesn't exist");
	}
	return li;
    }
    
public static void main(String[] args)
{
    keyvalue li=new keyvalue();
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the size..");
    int n=scan.nextInt();
     System.out.println("Enter the key and value..");
    for(int i=0;i<n;i++)
    {
        int key=scan.nextInt();
        String value=scan.next();
        li.insert(li,key,value);
        
    }
    li.display(li);
    System.out.println("Enter the key which you want to delete....");
    int k=scan.nextInt();
    
    li.del(li,k-1);
    li.display(li);
    System.out.println("Enter the value which you want to delete....");
    String v=scan.next();
    
    li.delvalue(li,v);
    li.display(li);
    System.out.println("Enter the key-value pair which you want to delete....");
    int kk=scan.nextInt();
    String s=scan.next();
    li.deleteboth(li,kk,s);
    li.display(li);
    
    
}
}
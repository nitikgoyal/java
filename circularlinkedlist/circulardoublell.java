import java.util.Scanner;

public class circulardoublell
{
  class Node 
  {
    int data;
    Node next;
    Node prev;
    Node(int d) 
    {
    data = d;
    }
   }

    Node head;
    Node tail;
    

public circulardoublell insertion(circulardoublell dl, int key, int index) 
{
     Node newNode = new Node(key);
     newNode.next = null;
     newNode.prev = null;
     Node current;
     int count = 1;
     int count1 = 0;
     Node last = dl.head;
     if(index==0) 
     {
     dl.head.prev=newNode;
     last=dl.head;
     while(last.next!=dl.head) 
     {
     last.next=newNode;
     }
     dl.head=newNode;
     }
else 
 {
  while (last.next != null && count != index) 
  {
  last = last.next;
  count++;
  }
  current = last.next;
  last.next = newNode;
  current.prev = newNode;
  newNode.prev = last;
  newNode.next = current;
 }
  return dl;
}
    
    
public static void deletelast(circulardoublell li)
{
    if(li.head==null)
        return;
    else 
    {
        if(li.head!=li.tail)
        {
          li.tail=li.tail.prev;
            li.tail.next=null;
        }
        else
        {
            li.head=li.tail=null;
        }
    }
}   

    
    
public void displayf(circulardoublell dl)
{
 Node temp = dl.head;
  while (temp != null) 
  {
   System.out.print(temp.data + " ");
   temp = temp.next;
  }
}
    
    
    public circulardoublell insertion11(circulardoublell dl, int data) 
{
Node newNode = new Node(data);
newNode.next = null;
newNode.prev = null;
if (dl.head == null) 
{
  dl.head = newNode;
  return dl;
} 
    else
{
int count = 0;
Node last = dl.head;
while (last.next != null) 
{
  last = last.next;
  count++;
}
 last.next = newNode;
 newNode.prev = last;
}
return dl;
}
    
    
    public circulardoublell insertionstart(circulardoublell li, int data)
    {
        Node newNode=new Node(data);
        if(li.head==null)
        {
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else
        {
         head.prev=newNode;
            newNode.next=head;
            newNode.prev=null;
            head=newNode;
            
        }
        return li;
    }
    public static circulardoublell deleteindex(circulardoublell li, int k) {
Node current = li.head, prev1 = null;
if (li.head == null) {
System.out.println("Linkedlist is empty");
return li;
}

else if (k == 0 && current != null) {
Node temp = li.head;
while (temp.next != li.head) {
temp = temp.next;
}
temp.next = current.next;
li.head = current.next;
System.out.println("Node delete from index" + k);
return li;
}
int count = 0;
while (current != null) {
if (k == count) {
Node temp = current.next;
prev1.next = current.next;
temp.prev = prev1;
System.out.println("Node deleted from index" + k);
break;
} else {
prev1 = current;
current = current.next;
count++;
}
}
if (current == null) {
System.out.println("Node index: " + k + " not found");
}
return li;
}
    
    public static void deletestart(circulardoublell li)
    {
        if(li.head==null)
        return;
        else 
        {
            if(li.head!=li.tail)
            {
                li.head=li.head.next;
                li.head.prev=null;
            }
            else
            {
                li.head=li.tail=null;
            }
        }  
    }
    
    public void displayrev(circulardoublell li)
    {
        Node temp=li.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node current;
        current=temp;
        while(current!=null) 
         {
            System.out.print(current.data+" ");
            current=current.prev;
        }
    }

/*public static void main(String arg[]) 
{
circulardoublell dl = new circulardoublell();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the count of data you want to enter");
int n = sc.nextInt();
System.out.println("Enter the data");
for (int i = 0; i < n; i++) 
{
int data = sc.nextInt();
dl.insertion11(dl, data);
}
System.out.println("Enter the index at  which you want to add");
int index = sc.nextInt();
System.out.println("Enter the data you want to Enter ");
int key = sc.nextInt();
dl.insertion(dl, key, index);
    
    System.out.println("Enter the data at which you want to enter...At begning");
    int d=sc.nextInt();
    dl.insertionstart(dl,d);
    
    dl.displayf(dl);
    System.out.println("In reverse order......");
    dl.displayrev(dl);
    
    
    System.out.println("delete first element....");
    dl.deletestart(dl);
    dl.displayf(dl);
//    System.out.println("Delete from last");
//    dl.deletelast(dl);
//     dl.displayf(dl);
}*/

}
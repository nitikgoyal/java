public class linkedListp
{
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
    
    public static linkedListp insert(linkedListp li,int data)
    {
        Node newNode=new Node(data);
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
    
    public static linkedListp insertbeg(linkedListp li,int data)
    {
        Node newNode=new Node(data);
       
        if(li.head==null)
        {
            li.head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        return li;
    }
    
    public static linkedListp insertindex(linkedListp li,int data,int index)
    {
        Node n=new Node(data);
        n.next=null;
        Node current=li.head,prev=null;
        if(index==0 && current!=null)
        {
            li.insertbeg(li,data);
            System.out.println("data at "+index+" updated sucessefully");
        }
        if(index>0 && current!=null)
        {
          int count=0;
            while(current!=null && count <index)
            {
                prev=current;
                current=current.next;
                count++;
            }
            n.next=prev.next;
            prev.next=n;
            System.out.println("data at "+index+" updated sucessefully");
        }
        if(current==null)
        {
            System.out.println("List out of bound");
        }
        return li;
    }
    
    public static void deletelast(linkedListp li)
    {
      Node temp=li.head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    
    public static linkedListp deleteindex(linkedListp li,int index)
    {
        Node current=li.head, prev=null;
        if(index==0 && current!=null)
        {
            li.head=current.next;
            System.out.println("Data is deleted sucessfully....");
        }
        if(index>0&& current!=null)
        {
            int count =0;
            while(current!=null)
            {
              if(count==index)
              {
                  prev.next=current.next;
                  System.out.println("data is deleted sucessfully....");
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
            System.out.println("Index out of bound ....");
        }
        return li;
    }

    public static void reverse(linkedListp li,Node temp)
    {
        //Node temp=li.head;
        if(temp==null)
        {
            System.out.println("LL doesnt exists");
            //return;
        }
        if(temp.next==null)
        { 
         System.out.println("linked list is:");
            System.out.println(temp.data);
        }
        else
        {
            reverse(li,temp.next);
            System.out.println(temp.data);
        }
    }
    
    public static void display(linkedListp li)
    {
        Node temp=li.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
            
        }
    }
    
    
    public static void rotate(linkedListp li,int k)
    {
        if(k==0)
            return ;
        
        Node temp=li.head;
        int count=1;
        while(temp!=null &&count<k)
        {
            temp=temp.next;
            count++;
        }
        
        if(temp==null)
            return ;
        Node knode= temp;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
            temp.next=li.head;
            li.head=knode.next;
            knode.next=null;
    
        
    }
    
    
    public static void swap(linkedListp li)
    {
        Node temp=li.head;
        while(temp!=null && temp.next!=null)
        {
            int k=temp.data;
            temp.data=temp.next.data;
            temp.next.data=k;
            temp=temp.next.next;
        }
    }
    
    public static void main(String[] args)
    {
        linkedListp li=new linkedListp();
        li.insert(li,10);
        li.insert(li,20);
        li.insert(li,30);
        li.insert(li,40);
        li.insert(li,50);
        li.insert(li,60);
        li.display(li);
//        li.insertbeg(li,5);
//        System.out.println("--------------------------------------------");
//        li.display(li);
//        li.insertindex(li,12,2);
//        System.out.println("--------------------------------------------");
//        li.display(li);
//        li.deletelast(li);
//        System.out.println("--------------------------------------------");
//        li.display(li);
//        li.deleteindex(li,2);
//        System.out.println("--------------------------------------------");
//        li.display(li);
//        li.reverse(li,li.head);
//        System.out.println("--------------------------------------------");
//        
//        
//        
//        li.rotate(li,4);
//         li.display(li);
        
//        li.swap(li);
//        li.display(li);
    }
}
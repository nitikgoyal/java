
////Queue using 2 Stacks>>>>>

import java.util.*;
public class stackUsingll
{
    static class Node
    {
        int data;
        Node link;
    }
    Node top;
    stackUsingll()
    {
        this.top=null;
    }
    
    public void push(int temp)
    {
        Node newNode=new Node();
        if(newNode==null)
        {
            System.out.println("Stack overflow");
        }
        newNode.data=temp;
        newNode.link=top;
        top=newNode;
    }
    
    public int pop()
    {
        int x;
        if(top==null)
        {
            System.out.println("Stack underflow");
             return 0;
        }
       else
       {
            x=top.data;
            top=top.link;   
       }
        return x;
    }
    public void display()
    {
        if(top==null)
        {
            System.exit(1);
        }
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;
        }
    }
    
    public int peek()
    {
        if(!isEmpty())
        {
            return top.data;
        }
        else
        {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean isEmpty()
    {
        return top==null;
    }
    public static void main(String[] args)
    {
        stackUsingll s1=new stackUsingll();
        stackUsingll s2=new stackUsingll();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            s1.push(scan.nextInt());
        }
//        s1.display();
//       //s1.display();
        for(int i=0;i<n;i++)
        {
            s2.push(s1.pop());
            //s1.pop();
        }
        s2.display();
    }
}
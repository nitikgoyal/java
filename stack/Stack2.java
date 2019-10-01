import java.util.Scanner;
import java.util.Stack;
 class Stack2
{
   public static class Node
     {
     int data;
     Node Link;
     }
    Node top;
    Stack2()
     {
     this.top=null;
     }
public void pop()
{
if(top==null)
{
System.out.println("Stack Underflow");
}
else
{
System.out.println(top.data+" has been popped");
top=top.Link;
}
}
public void push(int temp)
{
   Node newNode=new Node();
   if(newNode==null)
   {
     System.out.println("Stack Overflow");
   }
   newNode.data=temp;
   newNode.Link=top;
   top=newNode;
   System.out.println(temp+" has been pushed");
}
public int peek()
{
if(!isEmpty())
{
return top.data;
}
else
{
System.out.println("Stack is Empty");
return -1;
}
}
public boolean isEmpty()
{
return top==null;
}
public void display()
{
 if(top==null)
{
System.out.println("Stack Underflow");
System.exit(1);
}
 else
 {
  Node traversal=top;
  while(traversal!=null)
  {
  System.out.println(traversal.data);
  traversal=traversal.Link;
  }
}
}
     
     public static void main(String args[])
     {
         Stack2 s2 = new Stack2();
          s2.push(10);
          s2.push(20);
         s2.push(30);
         s2.push(40);
         s2.push(50);
         s2.display();
         
         s2.pop();
          s2.pop();
         s2.display();
         s2.peek();
         
     }
}

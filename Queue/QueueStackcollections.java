import java.util.*;
class QueueStackcollections
{
     static class Qu
    {
       static Stack s1;
       static Stack s2;
        
        static void enqueue(int x)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
         
         static int dequeue()
         {
             if(s1.isEmpty())
             {
                 System.out.println("StACK is empty");
                 System.exit(0);
             }
             int x=s1.peek();
             s1.pop();
             return x;
         }
    };
    
    public static void main(String[] args)
    {
      Qu q = new Qu();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        System.out.println(q.dequeue());
         System.out.println(q.dequeue());
         System.out.println(q.dequeue());
    }
}
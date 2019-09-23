import java.util.*;
   class Node
    {
        int key;
        Node left,right;
        public  Node(int item)
         {
            key=item;
            left=right=null;
         }
    }


public class treePush
{
    static Node root;
    treePush(int data)
    {
        root=new Node(data);
    }
       treePush()
    {
        root=null;
    }
    
     public  static void inorder(Node root)
   { 
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
        return;
    }
    public static void push1(int key)
    {
        root=push(root,key);
    }
    public static Node push(Node root,int key)
    {
       Node newNode=new Node(key);
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else if(key>root.key)
        {
            root.right=push(root.right,key);
        }
        else if(key<root.key)
        {
            root.left=push(root.left,key);
        }
       return root; 
    }
    
    public static void main(String args[])
    {
        treePush tr=new treePush();
        
        tr.push1(100);
         tr.push1(70);
         tr.push1(150);
         tr.push1(30);
         tr.push1(80);
        tr.push1(120);
        tr.push1(150);
        tr.push1(200);
        System.out.println("Inorder of tree is:");
        inorder(root);
    }
}
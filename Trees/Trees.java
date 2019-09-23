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
 
public class Trees
{
    static Node root;
    Trees(int data)
    {
        root=new Node(data);
    }
    Trees()
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
    
   public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }
        return;
    }
    
   public static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.key);
        }
        return;
    }

 
    public static void main(String args[])
    {
        Trees tr=new Trees();
        tr.root=new Node(10);
        
        tr.root.left=new Node(20);
        tr.root.right=new Node(30);
        
        tr.root.left.left=new Node(40);
        tr.root.left.right=new Node(50);
        System.out.println("Inorder of tree is:");
        inorder(root);
        System.out.println();
        System.out.println("Post order of tree is:");
        postorder(root);
        System.out.println();
        System.out.println("Pre order of tree is:");
        preorder(root);
    }
}

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


public class Searchtree
{
    static Node root;
    Searchtree(int data)
    {
        root=new Node(data);
    }
    Searchtree()
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
    
    public static void Search(int key)
    {
        Search(root,key);
    }
    public static void Search(Node root,int key)
    {
        if(root==null)
        {
            System.out.println("ELement not found");
        }
        else if(root.key==key)
        {
              System.out.println("Element found");
        }
        else if(root.key>key)
        {
          Search(root.left,key);
        }
        else 
        {
            Search(root.right,key);
        }
    }
    
     public  static int height(Node root)
 { 
         if(root == null)
             return -1;
         return 1+Math.max(height(root.left),height(root.right));
   /* int count=0,count2=0;
         
         
	if(root==null)
	{
		return 0;
	}
	else if(root.left!=null)
	{
		count++;
        height(root.left);
	}
	else if(root.right!=null)
	{
			 count2++;
	     height(root.right);
	}
	if(count>count2)	 
		 return count;
     else 
         return count2;*/
}
   public static void spiralfn(Node root) 
    { 
        int n=height(root); 
         //System.out.println(n);
        boolean b = false; 
        for (int i=1;i<=n+1;i++)
        { 
            spiral(root,i,b);
            b=!b;
        } 
    } 
 public static void spiral(Node root,int i,Boolean b) 
 {
    // int n=height(root);
//     System.out.println("height"+n);  
     if(root==null)
        {
            return;
        }
    // Boolean b=false;
        
         if(i==1)
         {
             System.out.println(root.key);
             
         }
         else if(i>1)
         {
             if(b!=false)
             {
             spiral(root.left,i-1,b);
             spiral(root.right,i-1,b);
             }
             else
             {
                  spiral(root.right,i-1,b);
                 spiral(root.left,i-1,b);
             }
            
        } 
    }
    public static void aufau(Node root)
    {  
        boolean b=false;
        int n=height(root);
        System.out.println(root.key);
   for(int i=1;i<n+1;i++)
    {
        if(root!=null)
        {
                
                    if(b!=false)
                    {
                        aufau(root.right);
                        aufau(root.left);
                        break;
                    }
                    else
                    { 
                        aufau(root.left);
                        aufau(root.right); 
                        break;
                    }
                } 
            }
             b=!b;
        }
    
    public static void main(String args[])
    {
        Searchtree tr=new Searchtree();
        
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
        //tr.Search(root,90);
       // tr.height();
       int h=height(tr.root);
        System.out.println("height="+h);
        System.out.println("Spiral is:");
        spiralfn(root);
        System.out.println("Aufaub is:");
        aufau(root);
       
    }
}
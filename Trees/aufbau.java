public static void aufbau(Node root)
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
                        aufbau(root.right);
                        aufbau(root.left);
                        break;
                    }
                    else
                    { 
                        aufbau(root.left);
                        aufbau(root.right); 
                        break;
                    }
                } 
            }
             b=!b;
        }
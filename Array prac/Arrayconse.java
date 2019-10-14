import java.util.*;
class Arrayconse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) 
        {
          arr[i]=sc.nextInt();
        }
        int check=0;
        for(int i=0;i<size;i++) 
        {
         if(arr[i]>100) 
         {
          System.out.println("Invalid input");
           break;
         }
        }
     for(int i=0;i<size-1;i++) 
     {
     if(arr[i]>arr[i+1]) 
     {
       System.out.println("Invalid input");
        break;
      }
     }
  for(int i=0;i<size-1;i++) 
  {
    int neg=arr[i+1]-arr[i];
    if(neg>0)
    {
    for(int j=arr[i]+1;j<arr[i+1];j++)
    {
    System.out.print(j+" ");
    }
   }
  }
 }
}
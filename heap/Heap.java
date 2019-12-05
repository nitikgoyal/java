// Implementing heaps (MAX HEAP)

import java.util.*;
class Heap
{
    static void heapify(int a[],int n,int i)
    {
        int largest=i;
        int l=(2*i)+1;
        int r=(2*1)+2;
        if(l<n && a[l]>a[largest])
        {
            largest=l;
        }
        if(r<n && a[r]>a[largest])
        {
            largest=r;
        }
        if(largest!=i)
        {
            int swap=a[i];
            a[i]=a[largest];
            a[largest]=swap;
            heapify(a,n,largest);
        }
    }
    
//   static void insertion(int a[],int n,int key)
//    {
//        n=n+1;
//        a[n-1]=key;
//        insheapify(a,n,n-1);
//    }
//    
// static void insheapify(int a[],int n,int i)
//    {
//        int parent=(i-1)/2;
//        if(parent>0)
//        {
//            if(a[i]>a[parent])
//            {
//                int temp=a[i];
//                a[i]=a[parent];
//                a[parent]=a[i];
//                insheapify(a,n,parent);
//            }
//        }
//    }
    
    static int deleteRoot(int a[],int n)
    {
        int last=a[n-1];
        a[0]=last;
        n=n-1;
        heapify(a,n,0);
        return n;
    }
    
    static void printheap(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
//        int key=scan.nextInt();
//        insertion(a,n,key);
//        printheap(a,n+1);
        n=deleteRoot(a,n);
        printheap(a,n);
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class test
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
           num.add(scan.nextInt());
        }
        int w=num.get(0);
        int z=num.get(1);
        w=w*z;
        System.out.println(w);
        
        Integer[] x=new Integer[num.size()];
        x=num.toArray(x);
        for(int i=0;i<2;i++)
        {
            x[i]=x[i]*x[i+2];
            System.out.println(x[i]);
        }
        int lt=x[3]*x[3-1];
        System.out.println(lt);
        
    }
}

//Infix to preFix;;;;;

import java.util.Scanner;
import java.util.Stack;
public class prefix
{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   Stack operands=new Stack();
   char ch[]=str.toCharArray();
   String str1=new String();
int count=0;
  for(int i=0;i<str.length();i++) 
  {
   if(ch[i]>='a'&&ch[i]<='z') 
   {
    str1=str1+ch[i];
    count++;
   }
  else if(ch[i]=='+'||ch[i]=='-'||ch[i]=='/'||ch[i]=='*') 
  {
   operands.push(ch[i]);
  }
  if(count==2) 
  {
   while(!operands.isEmpty())
    {
    str1=str1+operands.pop();
    }
   count=0;
  }
}
 System.out.println(str1);

}
}
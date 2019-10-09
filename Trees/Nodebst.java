class Nodebst
{
    int key;
    Nodebst left=null,right=null;
    Nodebst(int key)
    {
        this.key=key;
    }
}
class Main
{
    public static boolean issame(Nodebst x,Nodebst y)
    {
        if(x==null && y==null)
        {
            return true;
        }
        return (x!=null && y!=null)&& (x.key==y.key)&& issame(x.left,y.right) && issame(x.right,y.left);
    }
    public static void main(String[] args)
    {
        Nodebst x = new Nodebst(15);
		x.left = new Nodebst(10);
		x.right = new Nodebst(20);
		x.left.left = new Nodebst(8);
		x.left.right = new Nodebst(12);
		x.right.left = new Nodebst(16);
		x.right.right = new Nodebst(25);
        
        
        Nodebst y = new Nodebst(15);
		y.left = new Nodebst(10);
		y.right = new Nodebst(20);
		y.left.left = new Nodebst(8);
		y.left.right = new Nodebst(12);
		y.right.left = new Nodebst(16);
		y.right.right = new Nodebst(25);
        
        
        if (issame(x, y)) 
        {
			System.out.print("Given binary Trees are identical");
		} else 
        {
			System.out.print("Given binary Trees are not identical");
        }
    }
}
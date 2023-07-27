class Base
{
  	private int a;
  	public void set(int m)
   	{
     		a=m;
   	}
  	public void show1()
   	{
     		System.out.println("A="+a);
   	}
}













class Derived extends Base
{
  	private int b;
  	public void set(int m,int n)
   	{
     		set(m);
     		b=n;
   	}
  	public void show2()
   	{
     		show1();
     		System.out.println("B="+b);
   	}
}
class Prog091
{
  public static void main(String args[])
   {
	Derived D=new Derived();
	D.set(25,75);
	D.show2();
   }
}






































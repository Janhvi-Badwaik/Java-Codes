

class Base
{
  	private int a;
  	public void seta(int m)
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
  	public void setb(int m)
   	{
     		b=m;
   	}
  	public void show2()
   	{
     		System.out.println("B="+b);
   	}
}
class Prog090
{
  public static void main(String args[])
   {
	Derived D=new Derived();
	D.seta(100);
	D.setb(200);
	D.show1();
	D.show2();
   }
}


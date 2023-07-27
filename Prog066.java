class ABC
{
  int a;
  int b;
}
class Prog066
{
  public static void main(String args[])
   {
	ABC A1=new ABC();
	A1.a=100;
	A1.b=200;
	ABC A2=A1;
	System.out.println("Value of A through A1="+A1.a);
	System.out.println("Value of A through A2="+A2.a);
	System.out.println("Address of A1="+A1.hashCode());
	System.out.println("Address of A2="+A2.hashCode());
   }
}
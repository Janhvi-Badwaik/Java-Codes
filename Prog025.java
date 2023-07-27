class Prog025
{
 public static void main(String args[])
  {
	int a,b;
	a=10; b=20;
	System.out.println("A="+a+" B="+b);
	a=b++;
	System.out.println("A="+a+" B="+b);
	b=++a;
	System.out.println("A="+a+" B="+b);
	a=b++;
	System.out.println("A="+a+" B="+b);
  }
}
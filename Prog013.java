class Prog013
{
 public static void main(String args[])
  {
   	int a=11, b=22;
	System.out.println("Value Before Swapping");
	System.out.println("A="  +  a +  " B="  +b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Value After Swapping");
	System.out.println("A="+a+" B="+b);

  }
}
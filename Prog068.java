class ABC
{
  private int a;
  public void showa()
   {
     System.out.println("A="+a);
   }
}

  class Prog068
{
  public static void main(String args[])
   {
	ABC A1=new ABC();
	A1.a=100;
   }
}

/*
a has private access in ABC
	A1.a=100;
	  ^
1 error
*/
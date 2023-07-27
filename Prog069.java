class ABC
{
  private int a;
  public void showa()
   {
     System.out.println("A="+a);
   }
  public void seta(int m)
   {
     a=m;
   }
}

  class Prog069
{
  public static void main(String args[])
   {
	ABC A1=new ABC();
	A1.seta(100);
	A1.showa();
	
		
   }
}
	
	
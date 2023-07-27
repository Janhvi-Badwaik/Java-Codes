class ABC
{
  private int a,b;
  public ABC()
   {
     a=0; b=0;
   }
  public void getab(int m)
   {
     a=b=m;
   }
  public void getab(int m,int n)
   {
     a=m; b=n;
   }

  public void show()
   {
     System.out.println("A="+a);
     System.out.println("B="+b);
   }
}

class Prog083
{
  public static void main(String args[])
   {
     ABC A1=new ABC();
     ABC A2=new ABC();
     A1.getab(100);
     A2.getab(10,20);
     A1.show();
     A2.show();
   }
}

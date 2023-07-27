class ABC
{
  private int a,b;
  public ABC()
   {
     a=0; b=0;
   }
  public ABC(int m)
   {
     a=b=m;
   }
  public ABC(int p,int q)
   {
     a=p; b=q;
   }
  public void show()
   {
     System.out.println("A="+a);
     System.out.println("B="+b);
   }
}


class Prog070
{
  public static void main(String args[])
   {
     ABC A1=new ABC(10);
     ABC A2=new ABC(200,300);
     ABC A3=new ABC();
     A1.show();
     A2.show();
     A3.show();
   }
}

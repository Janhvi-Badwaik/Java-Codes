class ABC
{
  private int a,b;
  
  public void setab(int m)
   {
     a=b=m;
   }
  public void setab(int p,int q)
   {
     a=p; b=q;
   }
  public void show()
   {
     System.out.println("A="+a);
     System.out.println("B="+b);
   }
}
class Prog071
{
  public static void main(String args[])
   {
     ABC A1=new ABC();
     ABC A2=new ABC();
     A1.setab(100,200);
     A2.setab(10);
     A1.show();
     A2.show();
   }
}
  	
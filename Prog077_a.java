class ABC
{
  private int a,b;
  public ABC()
   {
     a=0; b=0;
   }
  public ABC(int a,int b)
   {
     this.a=a;
     this.b=b;
   }
  
  public void show()
   {
     System.out.println("A="+a);
     System.out.println("B="+b);
   }
}
class Prog077_a
{
  public static void main(String args[])
   {
     ABC A1=new ABC(10,20);
     A1.show();
     
   }
}
  	
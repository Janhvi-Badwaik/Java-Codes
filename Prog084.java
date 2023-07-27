class ADD
{

  public double addition(double n1)
   {
      return(n1);
   }
  public double addition(double n1,double n2)
   {
      return(n1+n2);
   }
  public double addition(double n1,double n2,double n3)
   {
      return(n1+n2+n3);
   }
}
class Prog084
{
  public static void main(String args[])
   {
     ADD A1=new ADD();
     System.out.println(A1.addition(10));
     System.out.println(A1.addition(20,30));
     System.out.println(A1.addition(5,6,7));
   }
}

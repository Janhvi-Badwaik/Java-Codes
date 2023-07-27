class PQR
{
  private void showp()
   {
     System.out.println("I M in showp()");
   }
  public void showq()
   {
     System.out.println("I M in showq()");
     showp();
   }
}
class Prog073
{
  public static void main(String args[])
   {
     PQR P1=new PQR();
     P1.showq(); 
   }
}
  	
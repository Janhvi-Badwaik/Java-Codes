class ABC
{
  public void showa()
   {
     System.out.println("i am in showa");
   }
}
class PQR extends ABC
{
  public void showp()
   {
     System.out.println("I m in showp");
   }
}

class Prog088
{
  public static void main(String args[])
   {
	PQR P1=new PQR();
	P1.showa();
	P1.showp();

   }
}


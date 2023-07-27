class ABC
{
  int a;
  public void showa()
   {
     System.out.println("A="+a);
   }
}

class PQR extends ABC
{
  int p;
  public void showp()
   {
     System.out.println("P="+p);
   }
}

class Prog089
{
  public static void main(String args[])
   {
	PQR P1=new PQR();
	P1.a=100;
	P1.p=200;
	P1.showa();
	P1.showp();
   }
}


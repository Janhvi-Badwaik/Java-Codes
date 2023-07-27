class PQR
{
  int a;
  int b;
}
class Prog065
{
  public static void main(String args[])
   {
	PQR P1,P2;
	P1=new PQR();
	P2=new PQR();        
	System.out.println("Address of P1="+P1.hashCode());
	System.out.println("Address of P1="+P2.hashCode());	
   }
}
	
	
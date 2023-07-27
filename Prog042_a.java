class Prog042_a
{
    static int a=10;
    static void show()
   {
     System.out.println(" Value of A in Show()= "+a);
   }
 public static void main(String args[])
  {
	show();
	System.out.println(" Value Of A in Main()"+a);
  }
 static
  {
   System.out.println(" Value of A IN Static block = "+a);
  }
}
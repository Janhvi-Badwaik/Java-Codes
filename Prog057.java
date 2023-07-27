class Prog057
{
  public static void main(String args[])
   {
    byte a=2;
	byte b=5;
	System.out.println("A&B="+(a&b));
	System.out.println("A|B="+(a|b));
	System.out.println("Not Of A="+(~a));
	System.out.println("A^B="+(a^b));
   }
}
/*
a   = 0000 0010
b   = 0000 0101
a&b = 0000 0000
a|b = 0000 0111
~a  = 1111 1101
a^b = 0000 0111

*/


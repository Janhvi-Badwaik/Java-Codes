class A
{
  A()
   {
     System.out.println("I m in A");
   }
}
 class B extends A
{
   B()
    {
      System.out.println("I m in B");
    }
}
class C extends B
{
   C()
    {
      System.out.println("I m in C");
    }
}
class Prog092
{
  public static void main(String args[])
   {
	C obj=new C();
   }
}


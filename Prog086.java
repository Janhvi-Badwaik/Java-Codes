class Test
{
  private int a;
  public Test()
   {
     a=0;
   }
  public Test(int p)
   {
     a=p;
   }
  Test incre_by_ten()
   {
     Test temp=new Test(a+10);
     return temp;
   }
  public void show()
   {
     System.out.println("A="+a);
   }
}


class Prog086
{
  public static void main(String args[])
   {
     Test T1=new Test();
     Test T2=new Test(15);
     T1=T2.incre_by_ten();
     T1.show();
     T2.show();
     T2=T1.incre_by_ten();
     T1.show();
     T2.show();
   }
}

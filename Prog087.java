class ADD
{
   int a,b;
  public ADD()
   {
     a=b=0;
   }
  public ADD(int a,int b)
   {
    this.a=a;
    this.b=b;
   }
  ADD addvalues(ADD A)
   {
     ADD temp=new ADD();
     temp.a=a+A.a;
     temp.b=b+A.b;
     return temp;
   }

  public void show()
   {
     System.out.println("A="+a);
     System.out.println("B="+b);
   }
}

class Prog087
{
  public static void main(String args[])
   {
     ADD A1=new ADD(19,20);
     ADD A2=new ADD(100,200);
     ADD A3=new ADD();
     A3=A1.addvalues(A2);
     A1.show();
     A2.show();
     A3.show();
   }
}

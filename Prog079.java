class Points
{
  private int x,y;
  public Points()
   {   }
  public Points(int x,int y)
   {
     this.x=x;
     this.y=y;
   }

  public void showpts()
   {
     System.out.println("X="+x);
     System.out.println("Y="+y);
   }
}
class Prog079
{
  public static void main(String args[])
   {
     Points P1=new Points();
     Points P2=new Points(10,20);
     Points P3=new Points();
     P1.showpts();
     P2.showpts();
     P3.showpts();
   }
}

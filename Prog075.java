class Rectangle
{
  private int x1,x2,y1,y2;

  public void setRect(int l,int t,int r,int b)
   {
     x1=l; y1=t;
     x2=r; y2=b;
   }
  void showRect()
   {
     System.out.println("X1="+x1);
     System.out.println("Y1="+y1);
     System.out.println("X2="+x2);
     System.out.println("Y2="+y2);
   }


  public int getwidth()
   {
     return(x2-x1);
   }
  public int getheight()
   {
     return(y2-y1);
   }
  public int getarea()
   {
     return(getwidth()*getheight());
   }
  public int getperimeter()
   {
     return(2*(getwidth()+getheight()));
   }
}
class Prog075
{
  public static void main(String args[])
   {
     Rectangle R1=new Rectangle();
     R1.setRect(2,3,10,12);
     R1.showRect();
     System.out.println("Width="+R1.getwidth());
     System.out.println("Height="+R1.getheight());
     System.out.println("Area of Rectangle="+R1.getarea());
     System.out.println("Perimeter="+R1.getperimeter());
   }
}

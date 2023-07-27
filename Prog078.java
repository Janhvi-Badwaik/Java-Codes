class Rect
{
  private double height;
  private double width;
  public Rect(){}
  public Rect(double height,double width)
   {
     this.height=height;
     this.width=width;
   }
  public double volume()
   {
     return(height*width);
   }
}
class Prog078
{
  public static void main(String args[])
   {
     Rect R1=new Rect(10,5);
     Rect R2=new Rect (6,7);
     System.out.println("Volume="+R1.volume());
     System.out.println("Volume="+R2.volume());
   }
}
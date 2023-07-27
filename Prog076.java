class Person
{
  public String name;
  public int age;
  public double sal;
  public Person()
   {
     name="Ram";
     age=18;
     sal=5000.0;
   }
  void setperson(String s,int a,double s1)
   {
     name=s;
     age=a;
     sal=s1;
   }
  void showperson()
   {
     System.out.println("Name="+name);
     System.out.println("Age="+age);
     System.out.println("Sal="+sal);
   }
}
class Prog076
{
  public static void main(String args[])
   {
     Person P1=new Person();
     Person P2=new Person();
     P2.setperson("Shiv",21,10000);
     P1.showperson();
     P2.showperson(); 
   }
}
  	
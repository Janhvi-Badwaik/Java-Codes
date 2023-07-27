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
  	void showperson()
   	{
     		System.out.println("Name="+name);
     		System.out.println("Age="+age);
     		System.out.println("Sal="+sal);
   	}
}
class Prog074
{
  public static void main(String args[])
   {
     Person P1=new Person();
     Person P2=new Person();
     P2.name="Shiv";
     P2.age=21;
     P1.showperson();
     P2.showperson(); 
   }
}
  	
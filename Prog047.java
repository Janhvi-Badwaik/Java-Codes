class Prog047
{
  public static void main(String args[])
   {
    int a[]={5,4,8,1,3};
	int i,j,temp;
	for(i=0;i<a.length-1;i++)
	 {
	  for(j=i+1;j<a.length;j++)
	   {
	     if(a[i]>a[j])
		{
		  temp=a[i];
		  a[i]=a[j];
		  a[j]=temp;
		}
		for(int k=0;k<a.length;k++)
	   	  {
	   	    System.out.print("\t"+a[k]);
	   	  }
 System.out.println();
	   }
	   System.out.println();
	 }
	for(i=0;i<a.length;i++)
	  {
	    System.out.print("\t"+a[i]);
	  }
	  System.out.println();
   }
}


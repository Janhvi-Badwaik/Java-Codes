class Prog052
{
  public static void main(String args[])
   {
    int a[][]=new int[3][];
	a[0]=new int[1];
	a[1]=new int[2];
	a[2]=new int[3];
	int i,j;
	for(i=0;i<3;i++)
	 {
	  for(j=0;j<=i;j++)
	   {
	     a[i][j]=(i+10)+(j+15);
	   }
	 }
	for(i=0;i<=2;i++)
	  {
	   for(j=0;j<=i;j++)
	    {
	     System.out.print(" "+a[i][j]);
	    }
	   System.out.println();
	  }
   }
}


class Prog048
{
  public static void main(String args[])
   {
       int a[][]=new int[3][2];
	int i,j;
	for(i=0;i<3;i++)
	 {
	  for(j=0;j<2;j++)
	   {
	     a[i][j]=i*j;

	   }
	 }

	for(i=0;i<3;i++)
	  {
	   for(j=0;j<2;j++)
	    {
	     System.out.print(" "+a[i][j]);
	    }
	   System.out.println();
	  }
   }
}


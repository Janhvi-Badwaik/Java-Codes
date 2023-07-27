class Prog049
{
  public static void main(String args[])
   {
    double a[][]=new double[3][3];
	int i,j;
	for(i=0;i<3;i++)
	 {
	  for(j=0;j<3;j++)
	   {
	     a[i][j]=(i+j)*10;
	   }
	 }

	for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	    {
	     System.out.print(" "+a[i][j]);
	    }
	   System.out.println();
	  }
   }
}


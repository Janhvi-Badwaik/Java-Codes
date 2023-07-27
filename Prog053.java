class Prog053
{
  public static void main(String args[])
   {
        int a[][][]=new int[3][3][3];
	int i,j,k;
	for(i=0;i<3;i++)
	 {
	  for(j=0;j<3;j++)
	   {
	    for(k=0;k<3;k++)
	      {
	       a[i][j][k]=i*j*k;

	      }

	   }
	 }
	for(i=0;i<3;i++)
	  {
	   for(j=0;j<3;j++)
	    {
	     for(k=0;k<3;k++)
	      {
	       System.out.print("\t"+a[i][j]);
	      }
	   System.out.println();
	    }
	  System.out.println();
	  }

   }
}


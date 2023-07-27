class Prog051
{
  public static void main(String args[])
   {
    int a[][]=new int[3][];
	a[0]=new int[3];
	a[1]=new int[3];
	a[2]=new int[3];
	int i,j;
	for(i=0;i<3;i++)
	{
	  	for(j=0;j<3;j++)
	   	{
	     		a[i][j]=(i*10)+(j*10);
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


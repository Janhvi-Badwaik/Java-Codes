class Prog051_a
{
  public static void main(String args[])
   {
    int a[][]=new int[3][];
	a[0]=new int[3];
	a[1]=new int[5];
	a[2]=new int[7];
	int i,j;
	for(i=0;i<a.length;i++)
	{
	  	for(j=0;j<a[i].length;j++)
	   	{
	     		a[i][j]=(i*10)+(j*10);
	   	}
	}
	for(i=0;i<a.length;i++)
		{
	  	for(j=0;j<a[i].length;j++)
	    	{
	     		System.out.print(" "+a[i][j]);
	    	}
	   	System.out.println();
	  }
   }
}


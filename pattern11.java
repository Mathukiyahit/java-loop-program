class demo
{
	public static void main(String arg[])
    {
		int i,j,k,n=4;

		for(i=5;i>=1;i--)
		{
			for(k=1;k<=n;k++)
			{
				System.out.print(" ");
			}
			n--;
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
    5
   54
  543
 5432
54321  */
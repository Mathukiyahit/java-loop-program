class demo
{
	public static void main(String arg[])
    {
		int i,j,k;

		for(i=5;i>=1;i--)
		{
			for(k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			for(j=i+1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
    5
   545
  54345
 5432345
543212345  */
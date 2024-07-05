class demo
{
	public static void main(String arg[])
    {
		int i,j,k;

		for(i=5;i>=1;i--)
		{
			for(k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
12345
 1234
  123
   12
    1  */
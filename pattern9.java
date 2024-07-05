class demo
{
	public static void main(String arg[])
    {
		int i,j,k;

		for(i=1;i<=5;i++)
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
    1
   12
  123
 1234
12345  */
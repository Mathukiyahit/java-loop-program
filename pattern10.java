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
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
    1
   21
  321
 4321
54321  */
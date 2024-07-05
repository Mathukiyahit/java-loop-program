class demo
{
	public static void main(String arg[]) 
	{
		int i,j;

		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
				
			}
			System.out.println();
		}
	}
}
/*
1
10
101
1010
10101  */
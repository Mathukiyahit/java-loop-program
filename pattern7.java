class demo
{
	public static void main(String arg[])
	{
		int i,j,a=1;

		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+1;
			}
			a=a-1;
			System.out.println();
		}
	}
}

/*
1  
1 2 
2 3 4 
4 5 6 7 
7 8 9 10 11  */
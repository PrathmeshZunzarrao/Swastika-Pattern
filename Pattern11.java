class Pattern11
{
	public static void main(String[] args) 
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=4; j++)
			{
				if(i == 2 | j == 2 || i<=1 && j==0 || i==0 && j>=3 || j==4 && i>=3 || i==4 && j<=1)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}

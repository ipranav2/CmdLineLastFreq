class CommandLineLastFrequency
{
	public static void main(String S[])
	{
		int c=0,frequency=1;
		for(int i=S.length-1;i>0;i--)
		{	
			int x=Integer.parseInt(S[i]);	
			if(i==S.length-1)
			c=x;
			else
			{
				if(x==c)
				frequency++;
			}
		}
	System.out.println("frequency of last character is = "+frequency);
	}
}
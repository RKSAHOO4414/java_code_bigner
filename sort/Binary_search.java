class Binary_Search
{
	public static void main(String[] args) 
	{
		int A[]={12,34,2,133,43,43,76};
		
		Binary_Search(A,7,43);

	}
	static void Binary_Search(int A[],int N,int item)
	{
		int m,l=0,u=N-1;
		while (l<=u) 
		{
			m=(l+u)/2;
			if (item==A[m]) 
			{
				System.out.println("Element found.. on position "+m);
				return;
			}
			else if(item>A[m])

				l=m+1;
			//System.out.println("hello");
			else
				u=m-1;
				
		}
	}
}
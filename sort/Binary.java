class Binary
{
	public static void main(String[] args) 
	{
		int A[]={12,2,32,4,23};
		int item=4;
		binary_search(A,5,item);

	}
	static void binary_search(int A[], int N,int item)
	{
		int u=N-1,l=0,m;
		while(u>=l) 
		{
			m=(l+u)/2;
			if (item==A[m]) 
			{
				System.out.println("Search Successful found in position: "+m);
			}
			else if (item > A[m]) 
			{
				l=m+1;
			}
			else if (item< A[m]) 
			{
				u=m-1;
			}
			else
				System.out.println("Element not found");
		}
	}
}
class Linear_search
{
	public static void main(String[] args) 
	{
		int A[]={23,3,12,4,34,45,32,40};
		int i;
		Linear_search(A,8,32);	
	}
	static void Linear_search(int A[],int N,int item)
	{
		int flag=1, i;
		for (i=0;i<=N-1;i++ ) 
		{
			if (A[i]==item) 
			{
				System.out.println("Element Successfully on position :"+i);
			}
			
		}
		if (flag==1) 
		{
			System.out.println("Sorry Element not Found...");
		}
	}
}
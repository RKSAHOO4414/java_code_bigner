class Bubble
{
	public static void main(String[] args) 
	{
		int A[]={12,4,23,2,24};
		int i;
		bubble_sort(A,5);
		for (i=0;i<=4 ;i++ ) 
		{
			System.out.println(" "+A[i]);
		}
	}
	static void bubble_sort(int A[], int N)
	{
		int i,temp,phase;
		for (phase=1;phase<=N-1;phase++)
		{
			for (i=0;i<=N-1-phase ;i++ ) 
			{
				if (A[i]>A[i+1]) 
				{
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;

				}	
			}
			
		}
	}
}

class Test
{
	public static void main(String[] args) 
	{
		int x[]={11,22,33,44,55};
		System.out.println("traverse by for loop");
		for (int i=0; i<x.length; i++)
		System.out.println(x[i]);
		System.out.println("traverse by foreach loop");
		int sum=0;
		for (int a:x) 
		{
			sum+=a;
			System.out.println(a);
		}
		System.out.println("after add each element of an array sum is" +sum);
	}
}
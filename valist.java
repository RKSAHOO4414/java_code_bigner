class Test
{
	static void add(int ...b)
	{
		int sum=0;
		for (int x : b)
			sum+=x;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Test.add(10,20);
		Test.add(1,3,45);
	}
}
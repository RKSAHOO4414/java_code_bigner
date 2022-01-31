class Test
{
	Test()
	{
		this(123);
		System.out.println("Test() with no args");
	}
	Test(String s)
	{
		this();
		System.out.println("Test() with String args");
	}
	Test(int x)
	{
		this(1.0);
		System.out.println("Test() with int args");
	}
	Test(double s)
	{
		System.out.println("Test() with double args");
	}
	public static void main(String[] args) 
	{
		new Test("hello");
	}
}
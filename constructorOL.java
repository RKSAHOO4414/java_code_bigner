//constructor overloading
class Test
{
	Test()
	{
		System.out.println("Test() with no args");
	}
	Test(String c)
	{
		System.out.println("Test() with string args");
	}
	Test(int x)
	{
		System.out.println("Test() with double args");
	}
	public static void main(String[] args) 
	{
		new Test();
		new Test(123);
		new Test(1.0);
		new Test("hello");
	}
}
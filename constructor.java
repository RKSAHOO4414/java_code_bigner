class Test
{
	Test()
	{
		System.out.println("constructor .........");
	}
	static void Test()
	{
		System.out.println("methode ........");
	}
	public static void main(String[] args) 
	{
		Test();
		Test.Test();
		Test t1=new Test();
		t1.Test();
	}
}
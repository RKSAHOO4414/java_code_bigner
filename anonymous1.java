class Test
{
	void show()
	{
		System.out.println("java is simple...");
	}
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		{
			void show()
			{
				System.out.println("hello world");
			}
		};
		Test t3=new Test()
		{
			void show()
			{
				System.out.println("hi world");
			}
		};
		t1.show();
		t2.show();
		t3.show();
	}
}
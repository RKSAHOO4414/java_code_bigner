class Test
{
	static int a=10;
	int b=20;
	void show()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		//System.out.println(b);
		Test t1=new Test();
		System.out.println(t1.b);
		t1.show();
	}
}
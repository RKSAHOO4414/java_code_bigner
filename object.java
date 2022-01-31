class Test
{
	int a=10,b=20,c=30;
	public static void main(String[] args) 
	{
		System.out.println(new Test().a);
		System.out.println(new Test().b);
		System.out.println(new Test().c);

		Test t1=new Test();

		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
	}
}
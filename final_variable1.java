class Test
{
	final int x;
	{
		java.util.Scanner sc=new Scanner(system.in);
		System.out.println("eneter the number ........");
		x=sc.nextInt();

	}
	Test()
	{
		System.out.println("constructor ...........");
	}
	public static void main(String[] args) 
	{
		System.out.println("main()");
		Test t1=new Test();
		Test t2=new Test();
		System.out.println("-----------------------");
		System.out.println("value of x for t1:"+t1.x);
		System.out.println("value of x for t2"+t2.x);
	}
}
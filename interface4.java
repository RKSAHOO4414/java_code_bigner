interface Test
{
	static void show()
	{
		System.out.println("show() ...");
	}
	int x=10;
}
interface Demo
{
	static void show()
	{
		System.out.println("static shoW() ...");
	}
	int x;
}
class Myclass implements Test,Demo
{
	public static void main(String[] args) 
	{
		Myclass mc= new Myclass();
		Test.show();
		Demo.show();
		//System.out.println(mc.x);	//reference to ambigious x is
		System.out.println(Test.x);
		System.out.println(Demo.x);
	}
}
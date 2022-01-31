class A
{
	int x=10
	A()
	{
		System.out.println("A class constructor .....");
	}
}
class Demo extends A
{
	int y=20;
	Demo()
	{
		System.out.println("Demo class constructor.........");
	}
}
class Test extends Demo
{
	int z=30;
	Test()
	{
		System.out.println("Test() class constructor.....");
	}
	public static void main(String[] args) 
	{
		Test t1= new Test();
		System.out.println(t1.x);
		System.out.println(t1.y);
		System.out.println(t1.z);
	}
}
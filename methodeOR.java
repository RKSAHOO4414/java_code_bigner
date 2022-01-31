//methode overrideing
class A
{

}
class B extends A
{

}
class Test
{
	A.get()
	{
		return value;
	}
	public static void show()
	{
		System.out.println("show() in test class");
	}
}
class Demo extends Test
{
	B.get()
	{
		return null;
	}
	public static void show()
	{
		System.out.println("show() in Demo class");
	}
	public static void main(String[] args) {
		
	}
}
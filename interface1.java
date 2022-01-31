Interface Test
{
	public static final int x=10;
	int a=20;
	void show();
	public abstract void fun();
}
abstract class Demo Implements Test
{
	int y;
	abstract void display();
	Demo()
	{
		System.out.println("demo() type constructor ...........");
	}
	public void fun()
	{
		System.out.println("fun() class constructor ...");
	}
}
class Myclass extends Demo 	//0% abstraction
{
	public void display()
	{
		System.out.println("display() ...");
	}
	public void show()
	{
		System.out.println("show() ....");
	}
	Myclass()
	{
		System.out.println("Myclass() .....");
	}
	public static void main(String[] args) 
	{
		System.out.println(Test.x);
		Myclass mc=new Myclass();
		mc.show();
		mc.display();
		mc.fun();
	}
}
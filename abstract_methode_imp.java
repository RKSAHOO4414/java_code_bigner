abstract class Test
{
	abstract void show();
	abstract void fun();
	int x=90;
	void display()	//complte
	{
		{
			System.out.println("display() ....");
		}
	}
}
abstract Myclass extends Demo
{
	void fun()
	{
		System.out.println("override.show()");
	}
}
class Myclass extends Demo
{
	void fun1()
	{
		System.out.println("override fun1() .........");
	}
	public static void main(String[] args) 
	{
	/*	Test t1=new Test();
		Demo D1= new Demo();
		*/
		//erorr if you trying to create object because those are absract

		Myclass mc =new Myclass();
		mc.show();
		mc.display();
		System.out.println(mc.x);
		mc.fun1();
	}
}
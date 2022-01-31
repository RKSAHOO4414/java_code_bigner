abstract class Test
{
	abstract void show()
	int x=90;
	void display()
	{
		System.out.println("display() ........");
	}
	static int y=50;
	static void fun()
	{
		System.out.println("fun() ..........");
	}
	public static void main(String[] args) 
	{
		//Test t1=new Test();	//can not create object
		System.out.println("i am in main() function ..........");
		System.out.println(Test.y);
		Test.fun();
	}
}
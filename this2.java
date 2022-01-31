class Demo
{
	int x=20;
	Demo(Test t)
	{
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(t.x);		
	}
}
class Test
{
	int x=10;
	void display()
	{
		new Demo(this);
	}
	public static void main(String[] args) 
	{
		new Test().display();
	}
}
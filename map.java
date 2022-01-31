class Myclass
{
	void showMessage()
	{
		System.out.println("java is simple");
	}
}
class Demo
{
	static Myclass mc=new Myclass();
}
class Test
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.mc.showMessage();
		Demo.mc.showMessage();
	}
}
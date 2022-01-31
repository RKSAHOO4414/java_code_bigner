//upcasting in case of interface
interface Demo
{
	void show();
	void display();
}
class Test implements Demo
{
	public void show()
	{
		System.out.println("show() ......");
	}
	public void display()
	{
		System.out.println("display() ...");
	}
	public void fun()
	{
		System.out.println("fun() ......");
	}
	public static void main(String[] args) 
	{
		Demo d=new Test();
		d.show();
		d.display();
		//d.fun();	//error
	}
}
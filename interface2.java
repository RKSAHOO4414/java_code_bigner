Interface A
{
	void show();
}
Interface B
{
	void show();
}
class Test implements A,B
{
	public void show()
	{
		System.out.println("show() ....");
	}
	public static void main(String[] args) 
	{
		Test t1=new Test();
	}
}
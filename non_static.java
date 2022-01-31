class Test
{
	Test()
	{
		System.out.println("i am in constructor..");
	}
	static
	{
		System.out.println("static block....");
	}
	public static void main(String[] args) 
	{
		System.out.print("i am in main methode .....");
		Test t1=new Test();	//object createtion constructor called
		Test t2= new Test();
	}
	{
		System.out.println("non static block....");
	}
}
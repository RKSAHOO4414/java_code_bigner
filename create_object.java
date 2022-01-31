class Test
{
	public static int x=10;
	public int y=20;
}
class Test
{
	public static void main(String[] args) 
	{
		Test t1=new Test();	//create object
		//System.out.println(x);	//directly possible within the same class
		System.out.println(Test.x);	//class name
		System.out.println(t1.x);
		//System.out.println(y);	//calling directly error
		//System.out.println(Test.y);	//calling class name error
		System.out.println(t1.y);
	}
}